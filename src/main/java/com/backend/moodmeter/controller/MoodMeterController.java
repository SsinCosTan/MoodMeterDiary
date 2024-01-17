package com.backend.moodmeter.controller;

import com.backend.moodmeter.model.MoodMeterDto;
import com.backend.moodmeter.service.MoodMeterService;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/mood-meter")
@RequiredArgsConstructor
public class MoodMeterController {
    private final MoodMeterService moodMeterService;
    /*
    CRUD
    Read : List 값 가져오기
     */
    @GetMapping("/list")
    public List<MoodMeterDto> responseMoodMeter(){
        return new ArrayList<>();
    }
}
