package cmdotenter.demo.features.sqlConverter.service;

import cmdotenter.demo.features.sqlConverter.dto.UserDTO;
//import cmdotenter.text2sql.auth.dto.request.SignUpRequest;
import cmdotenter.demo.features.sqlConverter.dto.request.createRequests.CreateUserRequest;
import cmdotenter.demo.features.sqlConverter.entity.User;

import java.util.List;

public interface UserService {
    public void save(CreateUserRequest createUserRequest);
    public UserDTO findById(Long id);
    public List<UserDTO> findAll();
    public void deleteById(Long id);
    public void updateUserById(Long id, CreateUserRequest createUserRequest);
    public User findByIdReturnUser(Long id);
    public UserDTO findByEmail(String email);
}
