package com.example.diplom.entities;

import com.example.diplom.enums.CertificateStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "CERTIFICATE")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CERTIFICATE_SEQ")
    @SequenceGenerator(name = "CERTIFICATE_SEQ", sequenceName = "CERTIFICATE_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "SERIAL_NUMBER", nullable = false)
    private String serialNumber;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Lob
    @Column(name = "CERTIFICATE_DATA", nullable = false)
    private byte[] certificateData;

    @Column(name = "ISSUE_DATE", nullable = false)
    private LocalDate issueDate;

    @Column(name = "EXPITY_DATE", nullable = false)
    private LocalDate expiryDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "CERTIFICATE_STATUS", nullable = false)
    private CertificateStatus status;
}
