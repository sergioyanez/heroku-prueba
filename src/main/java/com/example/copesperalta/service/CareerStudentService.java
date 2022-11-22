package com.example.copesperalta.service;

import com.example.copesperalta.dto.CareerInscriptionsDTO;
import com.example.copesperalta.dto.CareerReportDTO;
import com.example.copesperalta.entity.Student;
import com.example.copesperalta.repository.CareerStudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareerStudentService {
	@Autowired
    private CareerStudentRepository careerStudentRepository;
	
	public List<Student> getStudentsByCareerFilterCity(Long idCarrera, String ciudad){
		return careerStudentRepository.getStudentsByCareerFilterCity(idCarrera, ciudad);
	}
	
	public List<CareerInscriptionsDTO> getInscriptionSortedByCareer(){
		return careerStudentRepository.getInscriptionSortedByCareer();
	}
	
	public List<CareerReportDTO> getReportCareer(){
		return careerStudentRepository.getReportCareer();
	}

//	public CareerStudent enrollStudent(CareerStudent cs){
//		return careerStudentRepository.save(cs);
//	}

}
