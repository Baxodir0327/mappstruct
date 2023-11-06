package com.example.mappstruct.employee;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.example.mappstruct.employee.EmployeeMapper.EMPLOYEE_MAPPER;

class EmployeeMapperTest {

    @Test
    void fromMap() {
        var params = Map.of(
                "firstName", "Javohir",
                "lastName", "Elmurodov",
                "age", "28"
        );
        Employee employee = EMPLOYEE_MAPPER.fromMap(params);
        System.out.println("employee = " + employee);
    }

    @Test
    void fromMap2() {
        Map<String, Object> params = Map.of(
                "firstName", "Javohir",
                "lastName", "Elmurodov",
                "age", 28
        );
        Employee employee = EMPLOYEE_MAPPER.fromMap2(params);
        System.out.println("employee = " + employee);
    }
}