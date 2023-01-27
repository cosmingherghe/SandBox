package dev.cosmingherghe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Integer id;
    private String make;
    private String model;
    private String color;
    private Integer year;
    private Double price;
}
