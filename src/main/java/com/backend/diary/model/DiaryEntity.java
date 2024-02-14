package com.backend.diary.model;


import com.backend.global.domain.BaseEntity;
import com.backend.moodmeter.model.MoodMeterEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DiaryEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private String title;
    private String description;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mood_meter_id") // 외래 키 컬럼의 이름
    private MoodMeterEntity moodMeterEntity; // MoodMeterEntity를 참조하는 필드
    @Builder.Default
    private boolean deletedAt = false;
}
