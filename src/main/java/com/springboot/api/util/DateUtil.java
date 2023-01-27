package com.springboot.api.util;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtil {

    public static String getNowDateYYYYMMDDHHMMSS() {

        LocalDate now = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

        return now.format(formatter);
    }

}
