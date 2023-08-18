package com.navin;

import lombok.*;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
public class Person {
    private int personId;
    private String personName;
    private Address address; //Has-A Relationship
}
