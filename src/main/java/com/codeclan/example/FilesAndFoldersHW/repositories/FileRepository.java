package com.codeclan.example.FilesAndFoldersHW.repositories;

import com.codeclan.example.FilesAndFoldersHW.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
