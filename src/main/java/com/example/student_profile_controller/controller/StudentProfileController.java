package com.example.student_profile_controller.controller;

import com.example.student_profile_controller.service.StudentProfileService;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class StudentProfileController {

    StudentProfileService studentProfileService;


}
