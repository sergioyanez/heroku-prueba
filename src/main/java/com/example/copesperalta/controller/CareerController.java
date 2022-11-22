package com.example.copesperalta.controller;



import com.example.copesperalta.entity.Career;
import com.example.copesperalta.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/career")
public class CareerController {

	@Autowired
    private CareerService careerService;
    @GetMapping("/sortedByStudent")

    public List<Career> getCareersOrderByStudents() {
        return careerService.getCareersOrderByStudents();
    }

    @GetMapping("/")

    public List<Career> getCareers() {
        return careerService.getCareers();
    }

}