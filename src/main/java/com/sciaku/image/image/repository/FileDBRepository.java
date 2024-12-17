package com.sciaku.image.image.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sciaku.image.image.model.FileDB;

public interface FileDBRepository extends JpaRepository<FileDB,String>{
    
}
