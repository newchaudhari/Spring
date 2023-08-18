package com.navin.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Product {
    @Value("11")
    private int productId;
    @Value("Laptop")
    private String productName;
    @Value("85000")
    private int productPrice;
}
