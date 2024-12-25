package com.example.diplom.entities;

import com.example.diplom.enums.DocumentType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "DOCUMENT")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DOCUMENT_SEQ")
    @SequenceGenerator(name = "DOCUMENT_SEQ", sequenceName = "DOCUMENT_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "DOCUMENT_NAME", nullable = false)
    private String documentName;

    @Enumerated(EnumType.STRING)
    @Column(name = "DOCUMENT_TYPE", nullable = false)
    private DocumentType documentType;

    @Lob
    @Column(name = "DOCUMENT_DATA")
    private byte[] documentData;

    @Column(name = "IS_SIGNED")
    private boolean isSigned;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "CREATED_DATE")
    private LocalDateTime createdDate;
}
