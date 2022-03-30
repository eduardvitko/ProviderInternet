package com.example.ProviderInternetProject.repository;

import com.example.ProviderInternetProject.entity.SubscriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface SubscriptionsRepository extends JpaRepository<SubscriptionEntity, Integer> {
}
