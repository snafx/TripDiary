package com.snafx.TripDiary.controllers;

import com.snafx.TripDiary.repositories.TravelRepository;
import com.snafx.TripDiary.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class TravelsDiaryListController {

    private TravelRepository travelRepository;

    private UserRepository userRepository;

    @Autowired
    public TravelsDiaryListController(TravelRepository travelRepository, UserRepository userRepository) {
        this.travelRepository = travelRepository;
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/tripsDiaryList")
    public String allTravelsDiaryTrips(Model model) {
//        travelRepository.findAll();
        return "trips-diary";
    }


}
