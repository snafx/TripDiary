package com.snafx.TripDiary.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 30)
    @Column(unique = true)
    private String username;

    @NotNull
    @Size(min = 3, max = 30)
    private String password;

    @Email
    @NotNull
    @Size(min = 6, max = 30)
    @Column(unique = true)
    private String email;

    @NotNull
    @Size(min = 3, max = 30)
    private String firstName;

    @Size(min = 3, max = 30)
    private String lastName;

    @Size(min = 1, max = 30)
    private String location;

    @OneToMany(mappedBy = "userTrip")
    private List<Trip> tripList;

    public User(String username, String password, String email, String firstName, String lastName, String location) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }
}
