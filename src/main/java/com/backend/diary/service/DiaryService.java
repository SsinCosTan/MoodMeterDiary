package com.backend.diary.service;

import java.util.List;

import com.backend.diary.model.DiaryDto;
import com.backend.diary.model.DiaryEntity;

//Todo
public interface DiaryService {

    // 매개변수 생각해 보기
    String setDiary(DiaryDto diaryDto);

    String updateDiary(long bookId, DiaryDto diaryDto);

    List<DiaryDto> getDiaryList(long UserId);

    String deleteDiary(long bookId, long UserId);

}
