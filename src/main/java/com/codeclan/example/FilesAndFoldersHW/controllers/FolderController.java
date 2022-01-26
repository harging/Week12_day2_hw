package com.codeclan.example.FilesAndFoldersHW.controllers;

import com.codeclan.example.FilesAndFoldersHW.models.File;
import com.codeclan.example.FilesAndFoldersHW.models.Folder;
import com.codeclan.example.FilesAndFoldersHW.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity<Optional<Folder>> getFolder(@PathVariable Long id){
        return new ResponseEntity<>(folderRepository.findById(id),HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}/files")
    public ResponseEntity<List<File>> getFiles(@PathVariable Long id){
        return new ResponseEntity<>(folderRepository.getById(id).getFiles(), HttpStatus.OK);
    }

    @PostMapping(value = "folders")
    public ResponseEntity<Folder> postFile(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }

}
