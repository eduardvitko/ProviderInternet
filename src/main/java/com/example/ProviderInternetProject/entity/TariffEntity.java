package com.example.ProviderInternetProject.entity;

import com.example.ProviderInternetProject.enums.ServiceType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table(name = "tariffs")
public class TariffEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;

    @Enumerated(EnumType.STRING)
    private ServiceType type;
    @OneToMany
    private List<LimitEntity> limitsList;
    private int pricePerDay;
    private boolean isActive;
    private LocalDateTime created;
    private LocalDateTime updated;

}
