package com.harshita.cs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harshita.cs.model.Event;

/**
 *
 *
 * @description Repository for database CRUD operations
 */
@Repository
public interface EventRepository extends JpaRepository<Event, String>{

}
