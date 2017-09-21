package com.snafx.TripDiary.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
public class TripAddForm {

    @NotNull
    private String tripTitle;

    @NotNull
    private String country;

    @NotNull
    private String description;

    @NotNull
    private String description2;

    @NotNull
    private String description3;

    @NotNull
    private String photo;

    @NotNull
    private String photo2;

    @NotNull
    private String photo3;

    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateAdded;

    @Override
    public String toString() {
        return "TripAddForm{" +
                "tripTitle='" + tripTitle + '\'' +
                ", country='" + country + '\'' +
                ", description='" + description + '\'' +
                ", description2='" + description2 + '\'' +
                ", description3='" + description3 + '\'' +
                ", photo='" + photo + '\'' +
                ", photo2='" + photo2 + '\'' +
                ", photo3='" + photo3 + '\'' +
                ", dateAdded=" + dateAdded +
                '}';
    }
}
