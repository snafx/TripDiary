package com.snafx.TripDiary.repositories;

import com.snafx.TripDiary.models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTravelRepository extends JpaRepository<Trip, Long> {
}
