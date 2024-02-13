package com.first.firstproject.ResponseMessage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.first.firstproject.Entity.Student;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties("student")
public class Responsemessage {
   String responseMessage;
   Student student;
   List<Student> studentsList;


   public Responsemessage() {
   }

   public Responsemessage(List<Student> studentsList, String responseMessage, Student student) {
      this.responseMessage = responseMessage;
      this.student = student;
      this.studentsList = studentsList;

   }
   public String getResponseMessage() {
      return responseMessage;
   }

   public void setResponseMessage(String responseMessage) {
      this.responseMessage = responseMessage;
   }

   public Student getStudent() {
      return student;
   }

   public void setStudent(Student student) {
      this.student = student;
   }

   public List<Student> getStudentsList() {
      return studentsList;
   }

   public void setStudentsList(List<Student> studentsList) {
      this.studentsList = studentsList;
   }


}
