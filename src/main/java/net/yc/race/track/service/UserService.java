package net.yc.race.track.service;

import net.yc.race.track.DTO.RequestDTO.UserRequest;
import net.yc.race.track.DTO.ResponseDTO.UserResponse;
import net.yc.race.track.Enum.RoleEnum;
import net.yc.race.track.model.User;

import java.util.Optional;


public interface UserService {

     void changeRole(Long userId, RoleEnum role);
     UserResponse registerUser(UserRequest userRequest);
     Optional<User> authenticate(String username, String password);
}