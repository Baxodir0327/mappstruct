package com.example.mappstruct.car;

import org.junit.jupiter.api.Test;

import static com.example.mappstruct.car.CarMapper.CAR_MAPPER;

class CarMapperTest {

    @Test
    void toDto() {
        Car car = new Car("1", "Cobalt", "GM", 1200);
        CarDTO carDTO = CAR_MAPPER.toDto(car);
        System.out.println("carDTO = " + carDTO);
        Car entity = CAR_MAPPER.toEntity(carDTO);
        System.out.println("entity = " + entity);
        /*System.out.println("carMapper.toEntityWithCustomMethod(carDTO) = " + carMapper.toEntityWithCustomMethod(carDTO));*/
    }
}