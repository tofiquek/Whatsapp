package com.bacancy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bacancy.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{

}
