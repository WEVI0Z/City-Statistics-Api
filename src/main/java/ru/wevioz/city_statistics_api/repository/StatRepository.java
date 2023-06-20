package ru.wevioz.city_statistics_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.wevioz.city_statistics_api.entity.Stat;

@Repository
public interface StatRepository extends CrudRepository<Stat, Long> {
    
}