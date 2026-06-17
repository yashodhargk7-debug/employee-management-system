package com.yashodhar.employee_management.service;

import com.yashodhar.employee_management.dto.UserRequestDTO;
import com.yashodhar.employee_management.dto.UserResponseDTO;
import com.yashodhar.employee_management.entity.User;
import com.yashodhar.employee_management.exception.UsernameAlreadyExistsException;
import com.yashodhar.employee_management.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;

    }

    public UserResponseDTO registerUser(UserRequestDTO userRequestDTO) {

        User user = new User();

        user.setUsername(userRequestDTO.getUsername());
        user.setPassword(userRequestDTO.getPassword());
        user.setRole(userRequestDTO.getRole());

        if(userRepository.findByUsername(user.getUsername()).isPresent()) {
            throw new UsernameAlreadyExistsException("Username already exists");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        User savedUser = userRepository.save(user);

        return convertToDTO(savedUser);

    }

    private UserResponseDTO convertToDTO(User user) {

        UserResponseDTO  responseDTO = new UserResponseDTO();

        responseDTO.setId(user.getId());
        responseDTO.setUsername(user.getUsername());
        responseDTO.setRole(user.getRole());

        return responseDTO;
    }

}
