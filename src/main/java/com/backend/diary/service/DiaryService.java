package com.backend.diary.service;

import com.backend.diary.model.DiaryDto;
import com.backend.moodmeter.model.MoodMeterDto;
import java.util.List;

//Todo
public interface DiaryService {

    //매개변수 생각해 보기
    String setDiary(DiaryDto diaryDto);

    List<MoodMeterDto> getMoodMeterList();

    void deleteMoodMeter(long bookId, long UserId);

}
