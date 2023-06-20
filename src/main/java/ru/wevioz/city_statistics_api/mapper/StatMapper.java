package ru.wevioz.city_statistics_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.wevioz.city_statistics_api.dto.StatDto;
import ru.wevioz.city_statistics_api.entity.Stat;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StatMapper {
    @Mapping(target = "city", source = "entity.city")
    @Mapping(target = "country", source = "entity.country")
    @Mapping(target = "name", source = "entity.name")
    @Mapping(target = "creationDate", source = "entity.creationDate")
    StatDto toDto (Stat entity);

    @Mapping(target = "city", source = "dto.city")
    @Mapping(target = "country", source = "dto.country")
    @Mapping(target = "name", source = "dto.name")
    @Mapping(target = "creationDate", source = "dto.creationDate")
    Stat toEntity (StatDto dto);

    List<StatDto> toDtoList (Iterable<Stat> iterable);

    List<StatDto> toDtoList (List<Stat> list);
}