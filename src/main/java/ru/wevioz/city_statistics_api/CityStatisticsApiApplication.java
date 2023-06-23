package ru.wevioz.city_statistics_api;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class CityStatisticsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CityStatisticsApiApplication.class, args);
    }

}
