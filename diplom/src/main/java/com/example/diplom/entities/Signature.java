package com.example.diplom.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "SIGNATURE")
public class Signature {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIGNATURE_SEQ")
    @SequenceGenerator(name = "SIGNATURE_SEQ", sequenceName = "SIGNATURE_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "SIGNATURE_NAME", nullable = false)
    private String signatureName;

    @OneToMany
    @JoinColumn(name = "document_id", nullable = false)
    private List<Document> documents;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToOne
    @JoinColumn(name = "certificate_id", nullable = false)
    private Certificate certificates;

    @Column(name = "CREATED_DATE", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "UPDATED_DATE", nullable = false)
    private LocalDateTime updatedDate;
}
