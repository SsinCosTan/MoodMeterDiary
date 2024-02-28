package com.backend.diary.controller;

import com.backend.diary.model.DiaryDto;
import com.backend.diary.service.DiaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/mood-meter")
@RequiredArgsConstructor
public class DiaryController {

    private final DiaryService diaryService;

    /*
    CRUD
    Read : List 값 가져오기
     */
    @PostMapping("/diaries")
    public ResponseEntity<?> postDiary(@RequestBody DiaryDto diaryDto){
        String result = diaryService.setDiary(diaryDto);
        if(!result.equals("success"))
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
