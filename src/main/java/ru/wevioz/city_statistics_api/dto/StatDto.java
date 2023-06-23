package ru.wevioz.city_statistics_api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StatDto implements Serializable {
    private String city;
    private String country;
    private String name;
    private LocalDateTime creationDate;
}