package com.backend.user.service;

import com.backend.user.model.UserDto;
import com.backend.user.model.UserEntity;
import com.backend.user.model.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    //CRUD
    //Create
    @Override
    public void setUser(UserDto userDto) {

    }
    //Read
    //UserId에 맞춰서 해당 월의 무드미터 정보를 가지고 와야 함.
    @Override
    public List<UserEntity> getUser() {
        return null;
    }
    //Update UserUpdate
    @Override
    public void updateUser(UserDto userDto) {

    }
    //Delete 삭제_일기 삭제 시 함께 삭제. 복원 가능
    @Override
    public void deleteUser(long userId) {

    }







}
