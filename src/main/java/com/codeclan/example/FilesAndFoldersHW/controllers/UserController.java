package com.codeclan.example.FilesAndFoldersHW.controllers;

import com.codeclan.example.FilesAndFoldersHW.models.File;
import com.codeclan.example.FilesAndFoldersHW.models.Folder;
import com.codeclan.example.FilesAndFoldersHW.models.User;
import com.codeclan.example.FilesAndFoldersHW.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<Optional<User>> getUser(@PathVariable Long id){
        return new ResponseEntity<>(userRepository.findById(id),HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}/folders")
    public ResponseEntity<List<Folder>> getFolders(@PathVariable Long id){
        return new ResponseEntity<>(userRepository.getById(id).getFolders(), HttpStatus.OK);
    }

    @PostMapping(value = "users")
    public ResponseEntity<User> postFile(@RequestBody User user){
        userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
