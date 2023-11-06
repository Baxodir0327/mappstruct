package com.example.mappstruct.enums;

import org.junit.jupiter.api.Test;

import static com.example.mappstruct.enums.WeekDayToHaftaMapper.WEEK_DAY_TO_HAFTA_MAPPER;

class WeekDayToHaftaMapperTest {

    @Test
    void from() {
        System.out.println("WEEK_DAY_TO_HAFTA_MAPPER.from(Hafta.JUMA) = " + WEEK_DAY_TO_HAFTA_MAPPER.from(Hafta.JUMA));
        System.out.println("WEEK_DAY_TO_HAFTA_MAPPER.from(Hafta.JUMA) = " + WEEK_DAY_TO_HAFTA_MAPPER.from(Hafta.DUSHANBA));

    }

    @Test
    void to() {
        System.out.println(WEEK_DAY_TO_HAFTA_MAPPER.to(WeekDays.FRIDAY));
    }
}