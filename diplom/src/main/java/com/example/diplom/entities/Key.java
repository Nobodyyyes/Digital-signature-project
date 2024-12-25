package com.example.diplom.entities;

import com.example.diplom.enums.key.KeyStatus;
import com.example.diplom.enums.key.KeyType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "KEY")
public class Key {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "KEY_SEQ")
    @SequenceGenerator(name = "KEY_SEQ", sequenceName = "KEY_SEQ", allocationSize = 1)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "KEY_TYPE", nullable = false)
    private KeyType keyType;

    @OneToMany
    @JoinColumn(name = "certificate_id", nullable = false)
    private List<Certificate> certificates;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "KEY_STATUS", nullable = false)
    private KeyStatus keyStatus;

    @Column(name = "CREATED_DATE", nullable = false)
    private LocalDateTime createdDate;
}
