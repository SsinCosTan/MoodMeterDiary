package com.backend.moodmeter.service;

import com.backend.moodmeter.config.MoodMeterColor;
import com.backend.moodmeter.model.MoodMeterDto;
import com.backend.moodmeter.model.MoodMeterEntity;
import com.backend.moodmeter.model.MoodMeterRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MoodMeterServiceImpl implements MoodMeterService {
    private final MoodMeterRepository moodMeterRepository;
    //CRUD
    //Create

    //Todo UserID, DiaryID와 같이 저장 되어야 함
    @Override
    public void setMoodMeter(MoodMeterColor moodMeterColor){
        moodMeterRepository.save(MoodMeterEntity.builder().mood(moodMeterColor).build());
    }

    //Read
    //UserId에 맞춰서 해당 월의 무드미터 정보를 가지고 와야 함.
    @Override
    public List<MoodMeterDto> getMoodMeterList() {
        return null;
    }
    //Update 없음
    //Delete 삭제_일기 삭제 시 함께 삭제. 복원 가능
}
