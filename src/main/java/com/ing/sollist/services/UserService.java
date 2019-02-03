package com.ing.sollist.services;

import com.ing.sollist.entities.User;
import com.ing.sollist.forms.UserForm;

public interface UserService {
    void deleteAll();
    User saveOrUpdate(UserForm user);
}
