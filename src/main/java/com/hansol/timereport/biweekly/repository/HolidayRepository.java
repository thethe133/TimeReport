package com.hansol.timereport.biweekly.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hansol.timereport.biweekly.entity.Holiday;

public interface HolidayRepository extends JpaRepository<Holiday, Long> {

	List<Holiday> findByHolidayDateBetween(String startDate, String endDate);

	Optional<Holiday> findByHolidayDate(String holidayDate);

}
