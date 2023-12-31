package com.example.demo.service;

import com.example.demo.dto.NewUserDto;
import com.example.demo.dto.UserDto;
import com.example.demo.models.User;
import com.example.demo.vo.ItemStatsAgeVo;
import com.example.demo.vo.ItemStatsDobVo;

import java.time.LocalDate;
import java.util.List;

public interface UserService {
    User findById(Long userId);

    List<User> findByName(String name, int pageNumber);
    List<User> findBySex(Integer sex, int pageNumber);
    List<User> findByDob(LocalDate startDate, LocalDate endDate, int pageNumber);
    List<User> findAllUsers();
    User addUser(NewUserDto user);

    User updateUser(UserDto user);
    User deleteUser(long id);
    Boolean existsById(long id);

    User deleteById(long id);

    User findUser(String name, String password);
     List<User> findAllUsers(int page);

     List<ItemStatsAgeVo> groupUserByDobAndItemCategory();

}
