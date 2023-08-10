package com.system.E_Market.service;

import com.system.E_Market.dto.OtpDto;
import com.system.E_Market.dto.UserDto;

import com.system.E_Market.entity.User;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface UserService {

    void register(UserDto userDto) throws IOException;

    void sendEmail(String email) throws IOException;

    Optional<User> findByEmail(String email);

    void verifyOtp(OtpDto otpDto) throws IOException;

    List<User> getAllUsers();

    Optional<User> getActiveUser();

    void deleteUser(int id);

    void sendResetEmail(String email) throws IOException;

    void resetPass(String email, String password,String Otp) throws IOException;

    void update(UserDto userDto);


}
