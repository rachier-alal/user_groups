package com.mark.developer.jugtours.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import com.mark.developer.jugtours.model.User;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "user_group")

public class Group {

    @Id
    @GeneratedValue
    private Long group_id;
    @NonNull
    private String name;
    private String city;
    private String stateOrProvince;
    private String country;
    private String postalCode;

//    @ManyToOne(cascade=CascadeType.PERSIST)
//    private User user;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Event> events;

}

