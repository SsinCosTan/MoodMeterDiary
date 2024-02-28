package com.backend.user.controller;

import com.backend.user.model.UserDto;
import com.backend.user.service.UserService;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/mood-meter")
@RequiredArgsConstructor
public class UserController {
    private final UserService moodMeterService;
    /*
    CRUD
    Read : List 값 가져오기
     */
    @GetMapping("/list")
    public List<UserDto> responseMoodMeter(){
        return new ArrayList<>();
    }
}
