package com.tobbetu.ubs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController
{
    @RequestMapping("/students")
    public String getStudents()
    {
        return "students";
    }

    @RequestMapping("/studentlogin")
    public String getLogin()
    {
        return "studentlogin";
    }
}
