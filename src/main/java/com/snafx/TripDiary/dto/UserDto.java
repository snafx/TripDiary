package com.snafx.TripDiary.dto;

import com.snafx.TripDiary.validation.ValidEmail;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserDto {

    @NotNull
    @NotEmpty
    private String username;

    @NotNull
    @NotEmpty
    private String password;
    private String passwordConfirm;

    @NotNull
    @NotEmpty
    @ValidEmail
    private String email;


    private String firstName;

    private String lastName;

    private String location;

}
