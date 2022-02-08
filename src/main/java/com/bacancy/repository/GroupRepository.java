package com.bacancy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bacancy.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {

}
