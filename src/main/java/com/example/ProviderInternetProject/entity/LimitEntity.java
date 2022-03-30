package com.example.ProviderInternetProject.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Entity
@Table(name = "limits")
public class LimitEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    private int amount;
    private boolean isActive;
    private LocalDateTime created;
    private LocalDateTime updated;
}
