package com.example.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.beans.Student;

@Controller
public class FormControl {
	
	@RequestMapping("/form")
	public String formData(Model m) {
		
		Student std=new Student();
		m.addAttribute("std", std);
		
		return "form";
	}
	@RequestMapping("/reg")
	public ModelAndView generate(Student st) {
		
		
		return new ModelAndView("reciept","msg",st);
	}
	
	
	
}
