package com.example.mappstruct.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@ToString
@Getter
@AllArgsConstructor
public class Car {
    private String id;
    private String name;
    private String maker;
    private double price;
}
