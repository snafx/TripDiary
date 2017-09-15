package com.snafx.TripDiary.repositories;

import com.snafx.TripDiary.models.Travel;
import org.springframework.data.repository.CrudRepository;

public interface TravelRepository extends CrudRepository<Travel, Long> {
}
