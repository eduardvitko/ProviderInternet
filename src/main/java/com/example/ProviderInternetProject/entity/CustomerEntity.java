package com.example.ProviderInternetProject.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private int id;

@Column(name = "name")
    private String name;


    private String surname;


    private String phone_number;


    private String email;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "subscription_id")
    private List<SubscriptionEntity> services;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "wallet_id")
    private WalletEntity wallet;


    private boolean isActive;


    private LocalDateTime created;


    private LocalDateTime updated;


}
