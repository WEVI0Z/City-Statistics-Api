package ru.wevioz.city_statistics_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.wevioz.city_statistics_api.dto.StatDto;
import ru.wevioz.city_statistics_api.mapper.StatMapper;
import ru.wevioz.city_statistics_api.repository.StatRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StatService {
    private final StatRepository statRepository;
    private final StatMapper statMapper;

    public List<StatDto> getStats() {
        return statMapper.toDtoList(statRepository.findAll());
    }
}