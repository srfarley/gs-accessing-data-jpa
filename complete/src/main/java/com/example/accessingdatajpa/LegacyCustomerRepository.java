package com.example.accessingdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LegacyCustomerRepository extends CrudRepository<LegacyCustomer, Long> {

  List<LegacyCustomer> findByLastName(String lastName);
}
