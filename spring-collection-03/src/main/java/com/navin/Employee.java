package com.navin;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@ToString
public class Employee {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;
    private List<String> employeeAddress;
}
