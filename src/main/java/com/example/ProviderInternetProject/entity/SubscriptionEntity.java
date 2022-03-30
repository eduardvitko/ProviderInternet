package com.example.ProviderInternetProject.entity;

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
@Table(name = "subscriptions")
public class SubscriptionEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "tariffs_id")
    private List<TariffEntity> tariffs;
    private int days;
    private boolean isActive;
    private LocalDateTime created;
    private LocalDateTime updated;

}
