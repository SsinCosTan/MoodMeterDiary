package com.backend.moodmeter.config;

import lombok.Getter;

@Getter
public enum MoodMeterColor4th {
    FULFILLED("충만한"),
    TOUCHED("감동적인"),
    BALANCED("안정적인"),
    CAREFREE("근심 걱정 없는"),
    SERENE("안온한"),
    LOVING("다정한"),
    GRATEFUL("감사하는"),
    BLESSED("축복 받은"),
    COMFORTABLE("편한"),
    COZY("안락한"),
    CONTENT("자족하는"),
    SATISFIED("만족스러운"),
    RESTFUL("편안한"),
    PEACEFUL("평화로운"),
    TRANQUIL("고요한"),
    EASYGOING("태평한"),
    SECURE("안전한"),
    CHILL("차분한"),
    THOUGHTFUL("생각에 잠긴"),
    COMPLACENT("흐뭇한"),
    AT_EASE("속 편한"),
    CALM("평온한"),
    RELAXED("여유로운"),
    MELLOW("한가로운"),
    SLEEPY("나른한");
    private final String message;
    MoodMeterColor4th(String message) {
        this.message = message;
    }
}
