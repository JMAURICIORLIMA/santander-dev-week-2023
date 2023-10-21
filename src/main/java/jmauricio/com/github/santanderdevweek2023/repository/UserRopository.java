package jmauricio.com.github.santanderdevweek2023.repository;

import jmauricio.com.github.santanderdevweek2023.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRopository extends JpaRepository<User, Long> {
}