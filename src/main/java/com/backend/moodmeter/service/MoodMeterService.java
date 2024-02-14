package com.backend.moodmeter.service;

import com.backend.moodmeter.config.MoodMeterColor;
import com.backend.moodmeter.model.MoodMeterDto;
import java.util.List;

public interface MoodMeterService {
    //매개변수 생각해 보기
    List<MoodMeterDto> getMoodMeterList();
    void setMoodMeter(MoodMeterColor moodMeterColor);
}
