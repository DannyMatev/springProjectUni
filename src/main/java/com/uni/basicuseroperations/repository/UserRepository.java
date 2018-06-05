package com.uni.basicuseroperations.repository;

import com.uni.basicuseroperations.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
    Optional<UserModel> findOneByEmail(String email);
}
