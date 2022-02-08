package com.bacancy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bacancy.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}
