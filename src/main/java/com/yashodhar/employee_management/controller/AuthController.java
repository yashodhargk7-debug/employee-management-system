package com.yashodhar.employee_management.controller;

import com.yashodhar.employee_management.dto.UserRequestDTO;
import com.yashodhar.employee_management.dto.UserResponseDTO;
import com.yashodhar.employee_management.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController (UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public UserResponseDTO register(@Valid @RequestBody UserRequestDTO userRequestDTO) {

        return userService.registerUser(userRequestDTO);

    }

}
