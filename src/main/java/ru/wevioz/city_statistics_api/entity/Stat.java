package ru.wevioz.city_statistics_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Stat {
    @GeneratedValue
    @Id
    private Long id;

    @Column
    private String city;

    @Column
    private String country;

    @Column
    private String name;

    @Column
    private LocalDate creationDate;
}