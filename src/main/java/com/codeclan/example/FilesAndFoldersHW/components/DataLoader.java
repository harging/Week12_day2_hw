package com.codeclan.example.FilesAndFoldersHW.components;

import com.codeclan.example.FilesAndFoldersHW.models.File;
import com.codeclan.example.FilesAndFoldersHW.models.Folder;
import com.codeclan.example.FilesAndFoldersHW.models.User;
import com.codeclan.example.FilesAndFoldersHW.repositories.FileRepository;
import com.codeclan.example.FilesAndFoldersHW.repositories.FolderRepository;
import com.codeclan.example.FilesAndFoldersHW.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        User user = new User("James");
        userRepository.save(user);
        Folder folder = new Folder("Important Stuff", user);
        folderRepository.save(folder);
        File file = new File("pizza.rb", "rb", 100, folder);
        fileRepository.save(file);
    }
}
