package service;

import dtos.UserDTO;
import models.User;
import repositories.UserRepository;

public interface IUserService {

    User createUser(UserDTO userDTO) throws Exception;
    String login(String phoneNumber, String password, Long roleId) throws Exception;
}
