package ru.wevioz.city_statistics_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.wevioz.city_statistics_api.dto.StatDto;
import ru.wevioz.city_statistics_api.dto.StatGetRequest;
import ru.wevioz.city_statistics_api.service.StatService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stats")
public class StatController {
    private final StatService statService;

    @GetMapping
    private List<StatDto> get(@RequestBody StatGetRequest getRequest) {
        return statService.getStats(getRequest);
    }
}