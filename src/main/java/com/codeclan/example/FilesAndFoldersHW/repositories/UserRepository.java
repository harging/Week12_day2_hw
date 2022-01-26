package com.codeclan.example.FilesAndFoldersHW.repositories;

import com.codeclan.example.FilesAndFoldersHW.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
