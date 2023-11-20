package service;

import dtos.UserDTO;
import models.Role;
import models.User;
import repositories.RoleRepository;
import repositories.UserRepository;

import java.util.Optional;

public class UserService {
    private final UserRepository userRepository = new UserRepository();
    private final RoleRepository roleRepository = new RoleRepository();

    public User createUser(UserDTO userDTO) throws Exception{
        String phoneNumber = userDTO.getPhoneNumber();
        Long adminId=0L;
        Long userId=1L;
        if (phoneNumber.equals("0374418351") || phoneNumber.equals("0793584279") || phoneNumber.equals("0354281430")){
            userDTO.setRoleId(adminId);
        } else{
            userDTO.setRoleId(userId=1L);
        }
        Role role = roleRepository.findById(userDTO.getRoleId());

        if(role.getName().equalsIgnoreCase("Admin")){
            System.out.println("Admin");
        }
        if(userRepository.existsByPhoneNumber(phoneNumber)){
            throw new Exception("Phone number already exists")
        }
        else{
            User user = new User(role, userDTO.getName(), userDTO.getPassword(), userDTO.getPhoneNumber(), userDTO.getBirthDate(), userDTO.getEmail());
            return userRepository.save(user);
        }
    }

    public String login(String phoneNumber, String password, Long roleId) throws  Exception{
        Optional<User> optionalUser = userRepository.findUserByPhoneNumber(phoneNumber);
        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            // check password
            if (user.getPassword().equals(password)){
                if (roleId == 1){
                    return "Login successful";
                }else{
                    throw new Exception("Invalid role");
                }
            } else{
                throw new Exception("Invalid password");
            }
        }else{
            throw new Exception("Phone number not found");
        }
    }

}
