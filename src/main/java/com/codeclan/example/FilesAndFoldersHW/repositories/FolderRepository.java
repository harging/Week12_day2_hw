package com.codeclan.example.FilesAndFoldersHW.repositories;

import com.codeclan.example.FilesAndFoldersHW.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
