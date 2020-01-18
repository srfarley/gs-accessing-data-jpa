package com.example.accessingdatajpa;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.immutables.value.Value;

@Value.Modifiable
@InjectEntity
@Table(name = "customers")
public interface Customer {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Long getId();

  @Column
  String getFirstName();

  @Column
  String getLastName();
}
