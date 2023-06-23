package ru.wevioz.city_statistics_api.repository;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.wevioz.city_statistics_api.entity.Stat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface StatRepository extends CrudRepository<Stat, Long> {
    List<Stat> findAllByCreationDateGreaterThanEqualAndCreationDateLessThanEqual(LocalDateTime from, LocalDateTime to);
}