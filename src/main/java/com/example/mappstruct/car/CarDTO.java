package com.example.mappstruct.car;

import lombok.*;

@ToString
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class CarDTO {
    private String carName;
    private double carPrice;
}
