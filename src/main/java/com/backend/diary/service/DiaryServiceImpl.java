package com.backend.diary.service;

import com.backend.diary.model.DiaryEntity;
import com.backend.diary.model.DiaryRepository;
import com.backend.moodmeter.config.MoodMeterColor;
import com.backend.moodmeter.model.MoodMeterDto;
import com.backend.moodmeter.model.MoodMeterEntity;
import com.backend.moodmeter.model.MoodMeterRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//Todo
@Service
@RequiredArgsConstructor
public class DiaryServiceImpl implements DiaryService {

    private final DiaryRepository diaryRepository;
    //CRUD
    //Create

    //Todo UserID, DiaryID와 같이 저장 되어야 함
    @Override
    public void setMoodMeter(MoodMeterColor moodMeterColor) {
        MoodMeterEntity mood = MoodMeterEntity.builder().mood(moodMeterColor).build();
        diaryRepository.save(DiaryEntity.builder().moodMeterEntity(mood).build());
    }

    //Read
    //UserId에 맞춰서 해당 월의 무드미터 정보를 가지고 와야 함.
    @Override
    public List<MoodMeterDto> getMoodMeterList() {
        return null;
    }

    //Delete 삭제_일기 삭제 시 함께 삭제. 복원 가능
    @Override
    public void deleteMoodMeter(long bookId, long UserId) {
        //Todo mapping BookId, userId DeletedAt
    }

}
