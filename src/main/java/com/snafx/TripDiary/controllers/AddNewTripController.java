package com.snafx.TripDiary.controllers;

import com.snafx.TripDiary.models.Trip;
import com.snafx.TripDiary.repositories.JpaTravelRepository;
import com.snafx.TripDiary.repositories.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

@Controller
public class AddNewTripController extends WebMvcConfigurerAdapter{

    private JpaTravelRepository jpaTravelRepository;

    private JpaUserRepository jpaUserRepository;

    @Autowired
    public AddNewTripController(JpaTravelRepository jpaTravelRepository,
                                JpaUserRepository jpaUserRepository) {
        this.jpaTravelRepository = jpaTravelRepository;
        this.jpaUserRepository = jpaUserRepository;
    }

    @GetMapping(value = "/add-new-trip")
    public String showForm(Model model, Trip trip) {
        return "add-new-trip";
    }

    @PostMapping("/check")
    public String checkTripData(@Valid Trip trip, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-new-trip";
        }
        jpaTravelRepository.save(trip);
        return "redirect:/addResult";
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/addResult").setViewName("addResult");
    }
}
