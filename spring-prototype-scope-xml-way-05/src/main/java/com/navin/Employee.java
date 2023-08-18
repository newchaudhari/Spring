package com.navin;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Employee {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;
}
