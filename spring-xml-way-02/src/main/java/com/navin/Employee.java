package com.navin;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Employee {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;
}
