@Value.Style(
    passAnnotations = {
        Entity.class,
        Table.class,
        Column.class,
        Id.class,
        GeneratedValue.class,
        Transient.class
    },
    validationMethod = Value.Style.ValidationMethod.NONE,
    typeModifiable = "*Entity",
    isInitialized = "initialized"
)
package com.example.accessingdatajpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.immutables.value.Value;
