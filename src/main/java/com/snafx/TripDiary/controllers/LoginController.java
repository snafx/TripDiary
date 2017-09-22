package com.snafx.TripDiary.controllers;

import com.snafx.TripDiary.repositories.JpaTravelRepository;
import com.snafx.TripDiary.repositories.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    private JpaTravelRepository jpaTravelRepository;

    private JpaUserRepository jpaUserRepository;

    @Autowired
    public LoginController(JpaTravelRepository jpaTravelRepository, JpaUserRepository jpaUserRepository) {
        this.jpaTravelRepository = jpaTravelRepository;
        this.jpaUserRepository = jpaUserRepository;
    }


}
