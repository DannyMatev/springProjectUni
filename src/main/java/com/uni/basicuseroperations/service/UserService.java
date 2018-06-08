package com.uni.basicuseroperations.service;

import com.uni.basicuseroperations.model.UserModel;
import com.uni.basicuseroperations.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean registerUser(String email, String password, String gender) {
        Optional<UserModel> userModelRes = userRepository.findOneByEmail(email);

        if(userModelRes.isPresent()) {
            return false;
        }

        UserModel userModel = new UserModel(email, password, gender);
        userRepository.save(userModel);

        return true;
    }

}
