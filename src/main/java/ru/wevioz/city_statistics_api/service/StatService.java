package ru.wevioz.city_statistics_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.wevioz.city_statistics_api.dto.StatDto;
import ru.wevioz.city_statistics_api.dto.StatGetRequest;
import ru.wevioz.city_statistics_api.entity.Stat;
import ru.wevioz.city_statistics_api.mapper.StatMapper;
import ru.wevioz.city_statistics_api.repository.StatRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StatService {
    private final StatRepository statRepository;
    private final StatMapper statMapper;

    public List<StatDto> getStats(StatGetRequest getRequest) {
        if(getRequest.getFromDate() != null && getRequest.getToDate() != null) {
            return statMapper.toDtoList(statRepository.findAllByCreationDateGreaterThanEqualAndCreationDateLessThanEqual(
                    getRequest.getFromDate(),
                    getRequest.getToDate()
            ));
        }

        return statMapper.toDtoList(statRepository.findAll());
    }

    public StatDto create(StatDto statDto) {
        Stat stat = statMapper.toEntity(statDto);

        statRepository.save(stat);

        return statDto;
    }
}