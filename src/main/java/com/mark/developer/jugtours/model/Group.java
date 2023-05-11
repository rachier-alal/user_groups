package com.mark.developer.jugtours.model;

import lombok.*;
import com.mark.developer.jugtours.model.User;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

    @ManyToOne()
    private User user;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Event> events;

    public Group(String name, String city, String state, String country, String postalCode){
        this.name = name;
        this.city = city;
        this.stateOrProvince = state;
        this.country = country;
        this.postalCode = postalCode;
    }

}

