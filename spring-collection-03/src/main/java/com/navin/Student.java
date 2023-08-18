package com.navin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private int studentId;
    private String studentName;
    private Map<String,Integer> studentMarks;
}
