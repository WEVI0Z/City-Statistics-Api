package ru.wevioz.city_statistics_api.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Setter
@Getter
public class StatGetRequest {
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
}