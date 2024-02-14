package com.backend.user.service;


import com.backend.user.model.UserDto;
import com.backend.user.model.UserEntity;
import java.util.List;

public interface UserService {
    //매개변수 생각해 보기
    //CRUD
    //Create
    void setUser(UserDto userDto);
    //Read
    List<UserEntity> getUser();
    //Update
    void updateUser(UserDto userDto);
    //Delete
    void deleteUser(long userId);

}
