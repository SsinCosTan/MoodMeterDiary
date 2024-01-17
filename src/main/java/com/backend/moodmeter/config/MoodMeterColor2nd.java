package com.backend.moodmeter.config;

import lombok.Getter;

@Getter
public enum MoodMeterColor2nd {
    SHOCKED("충격 받은"),
    STUNNED("망연자실한"),
    RESTLESS("안절부절 못하는"),
    ANNOYED("거슬리는"),
    PEEVED("언짢은"),
    JITTERY("초조한"),
    TENSE("신경이 날카로운"),
    NERVOUS("초조한"),
    IRRITATED("짜증나는"),
    UNEASY("마음이 불편한"),
    STRESSED("스트레스 받는"),
    FRUSTRATED("좌절한"),
    ANGRY("화난"),
    WORRIED("근심하는"),
    CONCERNED("염려하는"),
    PANICKED("공황에 빠진"),
    FURIOUS("몹시 화가 난"),
    FRIGHTENED("겁 먹은"),
    APPREHENSIVE("우려하는"),
    TROUBLED("골치 아픈"),
    ENRAGED("격분한"),
    LIVID("격노한"),
    FUMING("화가 치밀어 오른"),
    ANXIOUS("불안한"),
    REPULSED("불쾌한");
    private final String message;
    MoodMeterColor2nd(String message) {
        this.message = message;
    }
}
