package com.backend.moodmeter.config;

import lombok.Getter;

@Getter
public enum MoodMeterColor1st {

    ECSTATIC("황홀한"),
    ELATED("의기양양한"),
    ENTHUSIASTIC("열광하는"),
    THRILLED("짜릿한"),
    BLISSFUL("더없이 행복한"),
    EXHILARATED("아주 신나는"),
    INSPIRED("영감을 받은"),
    OPTIMISTIC("낙관적인"),
    PROUD("자랑스러운"),
    PLAYFUL("재미있는"),
    FESTIVE("흥겨운"),
    MOTIVATED("동기 부여된"),
    EXCITED("흥분한"),
    HAPPY("행복한"),
    HOPEFUL("희망찬"),
    UPBEAT("긍정적인"),
    CHEERFUL("쾌활한"),
    LIVELY("활발한"),
    FOCUSED("집중하는"),
    JOYFUL("기쁜"),
    SURPRISED("놀란"),
    HYPER("들뜬"),
    ENERGIZED("기운이 넘치는"),
    PLEASED("만족스러운"),
    PLEASANT("유쾌한");
    private final String message;
    MoodMeterColor1st(String message) {
        this.message = message;
    }
}
