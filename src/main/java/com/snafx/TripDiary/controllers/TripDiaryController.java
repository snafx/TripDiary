package com.snafx.TripDiary.controllers;

import com.snafx.TripDiary.models.Travel;
import com.snafx.TripDiary.repositories.TravelRepository;
import com.snafx.TripDiary.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class TripDiaryController {

    private TravelRepository travelRepository;

    private UserRepository userRepository;

    @Autowired
    public TripDiaryController(TravelRepository travelRepository, UserRepository userRepository) {
        this.travelRepository = travelRepository;
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/tripsDiaryList")
    public String allTripsDiary(Model model) {
        Iterable<Travel> tripList = travelRepository.findAll();
        model.addAttribute("tripList", tripList);
        return "trips-diary";
    }

    @RequestMapping("/tripsDiaryList/trip/{id}")
    public String tripDetails(@PathVariable(name = "id") Long id, Model model) {
        Travel travel = travelRepository.findOne(id);
        model.addAttribute("trip", travel);
        return "trip";
    }

}
