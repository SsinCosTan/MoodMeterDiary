package com.backend.diary.model;

import com.backend.moodmeter.config.MoodMeterColor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DiaryDto {
    private String title;
    private String description;
    private MoodMeterColor mood;
}
