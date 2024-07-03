package com.example.sql.app.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Builder
@Table(name = "secces")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;
    String surname;
    int age;
}
