package com.hansol.timereport.api.biweekly.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TwoWeeksDto {

	private String year;
	private String fromdt;
	private String content;
	
	public static TwoWeeksDto entityToDto(TwoWeeksDto t) {
		return TwoWeeksDto.builder()
				.year(t.getYear())
				.fromdt(t.getFromdt())
				.content(t.getContent())
				.build();
	}


	@Builder
	public TwoWeeksDto(String year, String fromdt, String content) {
		this.year = year;
		this.fromdt = fromdt;
		this.content = content;
	}
}
