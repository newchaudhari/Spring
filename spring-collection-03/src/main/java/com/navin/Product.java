package com.navin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Product {
    private int productId;
    private String productName;
    private int productPrice;
    private Set<String> productDescription;
}
