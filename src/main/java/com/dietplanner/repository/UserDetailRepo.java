package com.dietplanner.repository;

import com.dietplanner.entity.UserDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepo extends JpaRepository<UserDetailEntity, Integer> {
}
