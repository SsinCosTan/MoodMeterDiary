package com.backend.moodmeter.model;

import com.backend.moodmeter.config.MoodMeterColor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoodMeterRepository extends JpaRepository<MoodMeterEntity, Long> {
    List<MoodMeterColor> findById(long id);
}
