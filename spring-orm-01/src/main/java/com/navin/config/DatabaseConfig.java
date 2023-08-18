package com.navin.config;

import com.navin.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Objects;
import java.util.Properties;

@Configuration
@PropertySource("application.properties")
@ComponentScan(basePackages = "com.navin")
@EnableTransactionManagement
public class DatabaseConfig {
    @Autowired
    Environment environment;

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername(environment.getProperty("dbUsername"));
        dataSource.setPassword(environment.getProperty("password"));
        dataSource.setUrl(environment.getProperty("url"));
        dataSource.setDriverClassName(Objects.requireNonNull(environment.getProperty("driver")));
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean getLocalSessionFactory(){
        LocalSessionFactoryBean localSessionFactoryBean=new LocalSessionFactoryBean();

        Properties properties=new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.hdm2ddl", "create");

        localSessionFactoryBean.setAnnotatedClasses(Course.class);
        localSessionFactoryBean.setDataSource(getDataSource());
        localSessionFactoryBean.setHibernateProperties(properties);
        return localSessionFactoryBean;
    }

    @Bean
    public HibernateTemplate getHibernateTemplate(){
        HibernateTemplate hibernateTemplate=new HibernateTemplate();
        hibernateTemplate.setSessionFactory(getLocalSessionFactory().getObject());
        return hibernateTemplate;
    }

    @Bean
    public HibernateTransactionManager gethibernateTransactionManager(){
        HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(getLocalSessionFactory().getObject());
        return hibernateTransactionManager;
    }

}
