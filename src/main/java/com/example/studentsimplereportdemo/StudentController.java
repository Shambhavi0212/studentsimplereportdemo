package com.example.studentsimplereportdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/")
    public String showStudent(Model model) {
        Student obj = new Student();
        obj.set("Vallapi Shambhavi", "22BK1A05H4", 99, 92, 99);

        model.addAttribute("name", obj.getName());
        model.addAttribute("rollno", obj.getRoll());
        model.addAttribute("marks1", obj.getMarks1());
        model.addAttribute("marks2", obj.getMarks2());
        model.addAttribute("marks3", obj.getMarks3());
        model.addAttribute("percentage", String.format("%.2f", obj.Percentage()));

        return "student";
    }
}
