package com.example.ProviderInternetProject.repository;

import com.example.ProviderInternetProject.entity.TariffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface TariffRepository extends JpaRepository<TariffEntity, Integer> {
}
