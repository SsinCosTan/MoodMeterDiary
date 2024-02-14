package com.backend.diary.controller;

import com.backend.diary.service.DiaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/mood-meter")
@RequiredArgsConstructor
public class DiaryController {

    private final DiaryService moodMeterService;
    /*
    CRUD
    Read : List 값 가져오기
     */

}
