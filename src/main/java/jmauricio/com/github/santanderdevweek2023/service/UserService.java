package jmauricio.com.github.santanderdevweek2023.service;

import jmauricio.com.github.santanderdevweek2023.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
}
