package com.KubernetesExample.controller;

import com.KubernetesExample.entity.Student;
import com.KubernetesExample.payload.ApiResponse;
import com.KubernetesExample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/{id}")
    public ApiResponse<String> getStudents(@PathVariable long id){
        ApiResponse response=new ApiResponse();
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        response.setStatus(200);
        response.setMessage("message found");
        response.setGetResponse(student);

        return response;

    }

    @PostMapping("/post")
    public ApiResponse<String> postData(@RequestBody Student student){
        Student save = studentRepository.save(student);
        ApiResponse response=new ApiResponse();

        response.setMessage("saved sucesfuly");
        response.setStatus(201);
        response.setGetResponse(student);
        return response;
    }

}
