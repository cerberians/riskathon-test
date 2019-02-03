package com.ing.sollist.services;

import com.ing.sollist.entities.User;
import com.ing.sollist.forms.UserForm;
import com.ing.sollist.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void deleteAll(){
        userRepository.deleteAll();
        log.debug("Neo4j reinitialized");
    }

    @Override
    public User saveOrUpdate(UserForm user) {
        User u = new User(user);
        return userRepository.save(u);
    }
}