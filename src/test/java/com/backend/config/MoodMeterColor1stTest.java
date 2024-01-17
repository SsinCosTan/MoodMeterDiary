package com.backend.config;

import static org.junit.jupiter.api.Assertions.*;

import com.backend.moodmeter.config.MoodMeterColor1st;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoodMeterColor1stTest {
    @Test
    @DisplayName("메시지 값 확인 테스트 코드")
    void getMessage() {
        MoodMeterColor1st ecstatic = MoodMeterColor1st.ECSTATIC;
        assertEquals("황홀한", ecstatic.getMessage());
    }
}