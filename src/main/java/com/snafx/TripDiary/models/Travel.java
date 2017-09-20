package com.snafx.TripDiary.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@Entity(name = "travels")
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User userTravel;

    @Size(min = 1, max = 40)
    @Column(nullable = false)
    private String tripTitle;

    private String country;

    @Column(name = "activity_type")
    @Enumerated(value = EnumType.STRING)
    private Activity activity;

    @Column
    @Size(max = 2000)
    private String description;

    @Column
    @Size(max = 2000)
    private String description2;

    @Column
    @Size(max = 2000)
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
    private LocalDate dateAdded;

    public Travel(User userTravel, String tripTitle, String country, Activity activity,
                  String description, String description2, String description3,
                  String photo, String photo2, String photo3, LocalDate dateAdded) {
        this.userTravel = userTravel;
        this.tripTitle = tripTitle;
        this.country = country;
        this.activity = activity;
        this.description = description;
        this.description2 = description2;
        this.description3 = description3;
        this.photo = photo;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.dateAdded = dateAdded;
    }
}
