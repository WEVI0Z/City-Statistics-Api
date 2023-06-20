package ru.wevioz.city_statistics_api.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class StatDto {
    private String city;
    private String country;
    private String name;
    private LocalDate creationDate;
}