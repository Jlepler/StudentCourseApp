package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    CourseRepository courseList;

    @Autowired
    StudentRepository studentList;

    @RequestMapping("/")
    public String home(Model model){

        model.addAttribute("studentList", studentList.findAll());
        model.addAttribute("courseList", courseList.findAll());
        return "index";
    }



    @PostConstruct
    public void fillTables()
    {
        Student s = new Student();
        s.setFirstName("John");
        s.setLastName("Smith");
        s.setDepartment("Computer Science");
        s.setEmail("S.John@gmail.com");
        studentList.save(s);

        s = new Student();
        s.setFirstName("Pete");
        s.setLastName("Johnson");
        s.setDepartment("Public Health");
        s.setEmail("P.Johnson@hotmail.com");
        studentList.save(s);

        s = new Student();
        s.setFirstName("Alfred");
        s.setLastName("Thompson");
        s.setDepartment("Engineering");
        s.setEmail("A.Thompson@hotmail.com");
        studentList.save(s);

        Course c = new Course();
        c.setName("Computer Basics");
        c.setStudents();
    }


}