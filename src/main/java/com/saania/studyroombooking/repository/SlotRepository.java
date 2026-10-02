package com.saania.studyroombooking.repository;

import com.saania.studyroombooking.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlotRepository extends JpaRepository<Slot, Long> {
}
