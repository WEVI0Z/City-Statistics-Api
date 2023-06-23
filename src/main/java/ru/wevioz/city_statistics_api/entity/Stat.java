package ru.wevioz.city_statistics_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name = "stats")
public class Stat {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stat_seq_generator")
    @SequenceGenerator(name = "stat_seq_generator", sequenceName = "stats_id_seq", allocationSize = 1)
    @Column(nullable = false, unique = true)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "name")
    private String name;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;
}