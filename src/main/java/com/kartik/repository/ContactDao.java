package com.kartik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kartik.Entity.Contact;

public interface ContactDao extends JpaRepository<Contact, Integer> {

}
