package com.backend.user.model;

import com.backend.moodmeter.config.MoodMeterColor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<MoodMeterColor> findById(long bookId);
}
