package com.mark.developer.jugtours.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")

public class User {

    @Id
    private String id;
    private String name;
    private String email;

}
