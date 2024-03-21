package com.dietplanner.repository;

import com.dietplanner.entity.UserDiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDietRepo extends JpaRepository<UserDiet, Integer> {
}
