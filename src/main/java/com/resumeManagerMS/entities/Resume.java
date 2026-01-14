package com.resumeManagerMS.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "resumes")
@Data
public class Resume {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long jobId;

    private String candidateName; // optional if extracted

    private String email; // optional if extracted

    private String filePath; // location in file system or S3

    @Column(columnDefinition = "TEXT")
    private String extractedText; // parsed content

    private LocalDateTime uploadedAt = LocalDateTime.now();
    
}
