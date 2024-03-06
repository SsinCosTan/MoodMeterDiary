package com.backend.diary.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.diary.model.DiaryDto;
import com.backend.diary.service.DiaryService;

import lombok.RequiredArgsConstructor;

@RestController("/api/mood-meter")
@RequiredArgsConstructor
public class DiaryController {

    private final DiaryService diaryService;

    /*
     * CRUD
     * Read : List 값 가져오기
     */
    // TODO UserId 를 받아 해당 권한의 사람에게 매핑되게 저장
    @PostMapping("/diaries")
    public ResponseEntity<?> postDiary(@RequestBody DiaryDto diaryDto) {
        String result = diaryService.setDiary(diaryDto);
        if (!result.equals("success"))
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    // TODO getList
    @Getmapping("/diaries")
    public ResponseEntity<?> getDiary(@RequestParam long UserId) {

        List<DiaryDto> result = diaryService.getDiaryList(bookId, diaryDto);
        if (result.isEmpty())
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    // TODO UserId 를 받아 적절한 권한을 가진 사람이 수정하는지 확인
    @PutMapping("/diaries/{bookId}")
    public ResponseEntity<?> putDiary(@PathVariable long bookId, @RequestBody DiaryDto diaryDto) {

        String result = diaryService.updateDiary(bookId, diaryDto);
        if (!result.equals("success"))
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    // TODO UserId 를 받아 적절한 권한을 가진 사람이 수정하는지 확인
    @DeleteMapping("/diaries/{bookId}")
    public ResponseEntity<?> deleteDiary(@PathVariable long bookId, @RequestParam long UserId) {

        String result = diaryService.deletedeleteDiary(bookId, UserId);
        if (!result.equals("success"))
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
