package com.snafx.TripDiary.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@Entity(name = "trips")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User userTrip;

    @Size(min = 1, max = 45)
    @Column(nullable = false)
    private String tripTitle;

    @Column
    @Size(max=30)
    private String country;

    @Column
    @Size(max = 700)
    private String description;

    @Column
    @Size(max = 700)
    private String description2;

    @Column
    @Size(max = 700)
    private String description3;

    @Column
    @Size(max = 1000)
    private String photo;

    @Column
    @Size(max = 1000)
    private String photo2;

    @Column
    @Size(max = 1000)
    private String photo3;

    @Column
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateAdded;

    public Trip(User userTrip, String tripTitle, String country,
                String description, String description2, String description3,
                String photo, String photo2, String photo3, LocalDate dateAdded) {
        this.userTrip = userTrip;
        this.tripTitle = tripTitle;
        this.country = country;
        this.description = description;
        this.description2 = description2;
        this.description3 = description3;
        this.photo = photo;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.dateAdded = dateAdded;
    }

    public Trip(String tripTitle, String country,
                String description, String description2, String description3,
                String photo, String photo2, String photo3, LocalDate dateAdded) {
        this.tripTitle = tripTitle;
        this.country = country;
        this.description = description;
        this.description2 = description2;
        this.description3 = description3;
        this.photo = photo;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.dateAdded = dateAdded;
    }
}
