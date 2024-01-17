package com.backend.moodmeter.config;

import lombok.Getter;

@Getter
public enum MoodMeterColor3rd {
    APATHETIC("냉담한"),
    BORED("지루한"),
    TIRED("피곤한"),
    FATIGUED("지친"),
    DRAINED("진이 빠진"),
    DOWN("의욕 없는"),
    SAD("슬픈"),
    DISHEARTENED("기죽은"),
    EXHAUSTED("기진맥진한"),
    SPENT("소모된"),
    DISAPPOINTED("실망스러운"),
    DISCOURAGED("낙담한"),
    LONELY("씁쓸한"),
    SULLEN("뚱한"),
    DESOLATE("고독한"),
    GLUM("침울한"),
    MOROSE("시무룩한"),
    MISERABLE("비참한"),
    DEPRESSED("우울한"),
    HOPELESS("가망 없는"),
    DISGUSTED("역겨운"),
    PESSIMISTIC("비관적인"),
    ALIENATED("소외된"),
    DESPONDENT("의기소침한"),
    DESPAIRING("절망한");
    private final String message;
    MoodMeterColor3rd(String message) {
        this.message = message;
    }
}
