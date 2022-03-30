package com.example.ProviderInternetProject.repository;

import com.example.ProviderInternetProject.entity.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletsRepository extends JpaRepository< WalletEntity,Integer> {
}
