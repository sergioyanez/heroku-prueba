package com.example.copesperalta.service;


import com.example.copesperalta.entity.Career;
import com.example.copesperalta.repository.CareerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareerService {
    @Autowired
    private CareerRepository careerRepository;

    public List<Career> getCareersOrderByStudents() {
        return careerRepository.getAllCareersByStudentsAmount();
    }

    public List<Career> getCareers() {
        return careerRepository.getCareers();
    }
//    public Career addCareer(Career c) {
//        return careerRepository.save(c);
//    }
}
