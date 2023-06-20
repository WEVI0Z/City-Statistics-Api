package ru.wevioz.city_statistics_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.wevioz.city_statistics_api.dto.StatDto;
import ru.wevioz.city_statistics_api.service.StatService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StatController {
    private StatService statService;

    @GetMapping
    private List<StatDto> get() {
        return statService.getStats();
    }
}