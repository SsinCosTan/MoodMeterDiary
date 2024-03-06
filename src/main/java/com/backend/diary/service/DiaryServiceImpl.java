package com.backend.diary.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.backend.diary.model.DiaryDto;
import com.backend.diary.model.DiaryEntity;
import com.backend.diary.model.DiaryRepository;

import lombok.RequiredArgsConstructor;

//Todo
@Service
@RequiredArgsConstructor
public class DiaryServiceImpl implements DiaryService {

    private final DiaryRepository diaryRepository;
    // CRUD
    // Create

    // Todo UserID, DiaryID와 같이 저장 되어야 함
    @Override
    public String setDiary(DiaryDto diaryDto) {
        DiaryEntity diary = DiaryEntity.builder()
                .title(diaryDto.getTitle())
                .description(diaryDto.getDescription())
                .mood(diaryDto.getMood()).build();
        diaryRepository.save(diary);
        return "success";
    }

    @Override
    public String setDiary(DiaryDto diaryDto) {
        DiaryEntity diary = DiaryEntity.builder()
                .title(diaryDto.getTitle())
                .description(diaryDto.getDescription())
                .mood(diaryDto.getMood()).build();
        diaryRepository.save(diary);
        return "success";
    }

    @Override
    public String updateDiary(long bookId, DiaryDto diaryDto) {
        Optional<DiaryEntity> optionalDiary = diaryRepository.findById(bookId);
        if (optionalDiary.isEmpty()) {
            return "fail";
        } else {
            DiaryEntity diary = optionalDiary.get();
            if (diaryDto.getTitle() != null) {
                diary.setTitle(diaryDto.getTitle());
            }
            if (diaryDto.getDescription() != null) {
                diary.setDescription(diaryDto.getDescription());
            }
            diaryRepository.save(diary);
        }
        return "success";
    }

    // Read
    // UserId에 맞춰서 해당 월의 무드미터 정보를 가지고 와야 함.
    // TODO Make user
    @Override
    public List<DiaryDto> getDiaryList(long UserId) {

        return null;
    }

    // Delete 삭제_일기 삭제 시 함께 삭제. 복원 가능
    @Override
    public String deletedeleteDiary(long bookId, long UserId) {
        Optional<DiaryEntity> optionalDiary = diaryRepository.findById(bookId);
        if (optionalDiary.isEmpty()) {
            return "fail";
        } else {
            DiaryEntity diary = optionalDiary.get();
            diary.setDeletedAt(true);
            diaryRepository.save(diary);
        }
        return "success";
    }
}
