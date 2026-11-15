package com.mounika.FSProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import entity.*;
import service.*;

@Controller
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute("student",new Student());
        return "home";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Student student)
    {
        service.saveStudent(student);
        return "success";
    }

}
