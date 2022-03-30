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

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    private ServiceType type;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "limits_id")
    private List<LimitEntity> limitsList;

    @Column(name = "pricePerDay")
    private int pricePerDay;

    @Column(name = "isActive")
    private boolean isActive;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "updated")
    private LocalDateTime updated;

}
