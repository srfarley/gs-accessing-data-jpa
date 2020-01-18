package com.example.accessingdatajpa;

import javax.persistence.Entity;

import org.immutables.annotate.InjectAnnotation;

@InjectAnnotation(type = Entity.class, target = InjectAnnotation.Where.MODIFIABLE_TYPE)
public @interface InjectEntity {
}
