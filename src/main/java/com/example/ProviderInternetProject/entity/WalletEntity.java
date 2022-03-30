package com.example.ProviderInternetProject.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "wallets")
public class WalletEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String number;
    private int balance;

}
