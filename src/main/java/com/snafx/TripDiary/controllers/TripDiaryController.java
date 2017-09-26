package com.snafx.TripDiary.controllers;

import com.snafx.TripDiary.models.Trip;
import com.snafx.TripDiary.repositories.JpaTravelRepository;
import com.snafx.TripDiary.repositories.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
@RequestMapping(path = "/")
public class TripDiaryController {

    private JpaTravelRepository jpaTravelRepository;

    private JpaUserRepository jpaUserRepository;

    @Autowired
    public TripDiaryController(JpaTravelRepository jpaTravelRepository, JpaUserRepository jpaUserRepository) {
        this.jpaTravelRepository = jpaTravelRepository;
        this.jpaUserRepository = jpaUserRepository;
    }

    @GetMapping(value = "/tripsDiaryList")
    public String allTripsDiary(Model model) {
        Iterable<Trip> tripList = jpaTravelRepository.findAll();
        model.addAttribute("tripList", tripList);
        return "trips-diary";
    }

    @RequestMapping("/tripsDiaryList/trip/{id}")
    public String tripDetails(@PathVariable(name = "id") Long id, Model model) {
        Trip trip = jpaTravelRepository.findOne(id);
        model.addAttribute("trip", trip);
        return "trip";
    }

}
