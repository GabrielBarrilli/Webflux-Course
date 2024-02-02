package org.gabrielbarrilli.webfluxcourse.service;

import org.gabrielbarrilli.webfluxcourse.entity.User;
import org.gabrielbarrilli.webfluxcourse.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsuario(){

        return userRepository.findAll();
    }
}
