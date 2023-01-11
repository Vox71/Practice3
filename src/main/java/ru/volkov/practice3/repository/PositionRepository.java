package ru.volkov.practice3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.volkov.practice3.model.Position;
import java.util.UUID;

@Repository
public interface PositionRepository extends JpaRepository<Position, UUID> {
}