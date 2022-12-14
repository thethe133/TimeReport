package com.hansol.timereport.biweekly;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.hansol.timereport.biweekly.dto.HolidayDto;
import com.hansol.timereport.biweekly.dto.TwoWeeksBoxDto;
import com.hansol.timereport.biweekly.entity.Holiday;

public interface BiWeeklyService {

	String findStartOfWeekday(String targetDay);

	Map<String, String> findHolidayBetweenMap(String startDay, String endDay);

	Map<String, String> findHolidayInMap(List<String> days);

	List<HolidayDto> findHolidayDateBetweenList(String startDay, String endDay);

	HolidayDto findHolidayBy(String holidayDate);

	TwoWeeksBoxDto findTwoWeeks();	
	//승인 휴일 체크
	Holiday findByHolidayDate(String holidayDate);
	
	boolean isExistFromdt(String targetDay);

	Boolean saveTwoWeeks();
	
	boolean isValidYearAndMonth(String year, String month);
	
	boolean isValidDate(String targetDay);
	
	List<Holiday> findHolidayDateBetween(String startDay, String endDay);
}
