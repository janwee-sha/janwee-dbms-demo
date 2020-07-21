package com.janwee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.janwee.entity.Address;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressJpaRepository extends JpaRepository<Address, Long> {
}
