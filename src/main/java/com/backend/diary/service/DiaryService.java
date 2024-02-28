package com.backend.diary.service;

import com.backend.diary.config.MoodMeterColor;
import com.backend.diary.model.MoodMeterDto;
import java.util.List;
//Todo
public interface DiaryService {
    //매개변수 생각해 보기
    void setMoodMeter(MoodMeterColor moodMeterColor);
    List<MoodMeterDto> getMoodMeterList();
    void deleteMoodMeter(long bookId, long UserId);

}
