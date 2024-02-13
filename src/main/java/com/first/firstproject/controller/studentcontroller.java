package com.first.firstproject.controller;

import com.first.firstproject.Entity.Student;
import com.first.firstproject.ResponseMessage.Responsemessage;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class studentcontroller {


    ArrayList<Student> students = new ArrayList<>();

    @PostMapping("/create")
    public Responsemessage createStudent(@RequestBody Student student){
        Responsemessage responsemessage = new Responsemessage();
        students.add(student);
        responsemessage.setResponseMessage("student hasbeen created");
        responsemessage.setStudent(student);
        return responsemessage;
    }
    @GetMapping("/all")
    public Responsemessage getallstudents (){
        Responsemessage responsemessage = new Responsemessage();
        responsemessage.setResponseMessage("retrived all students");
        responsemessage.setStudentsList(students);
        return responsemessage;
    }
}
