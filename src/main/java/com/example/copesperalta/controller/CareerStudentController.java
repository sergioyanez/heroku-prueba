package com.example.copesperalta.controller;



import com.example.copesperalta.dto.CareerInscriptionsDTO;
import com.example.copesperalta.dto.CareerReportDTO;
import com.example.copesperalta.entity.CareerStudent;
import com.example.copesperalta.entity.Student;
import com.example.copesperalta.service.CareerStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/careerStudent")
public class CareerStudentController {
	
	@Autowired
	private CareerStudentService careerStudentService ;


	@GetMapping("/sortedByInscriptions")


	public List<CareerInscriptionsDTO>getInscriptionSortedByCareer(){
		return careerStudentService.getInscriptionSortedByCareer();
	}
	
	@GetMapping("/{careerId}/{city}")

	public List<Student> getStudentsByCareerFilterCity(@PathVariable("careerId") Long id, @PathVariable("city") String city){
		return careerStudentService.getStudentsByCareerFilterCity(id, city);
	}
	
	@GetMapping("/report")

	public List<CareerReportDTO> getReportCareer() {
		return careerStudentService.getReportCareer();
	}


//	@PostMapping("")
//	public CareerStudent enrollStudent(@RequestBody CareerStudent cs){
//		return careerStudentService.enrollStudent(cs);
//	}
}
