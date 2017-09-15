package com.snafx.TripDiary.controllers;

import com.snafx.TripDiary.repositories.TravelRepository;
import com.snafx.TripDiary.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddNewTripController {

    private TravelRepository travelRepository;

    private UserRepository userRepository;

    @Autowired
    public AddNewTripController(TravelRepository travelRepository, UserRepository userRepository) {
        this.travelRepository = travelRepository;
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/add-new-trip")
    public String addNewTrip(Model model) {
        return "add-new-place";
    }
}
