package cmdotenter.demo.text2sql.service;

import cmdotenter.demo.text2sql.dto.UserDTO;
//import cmdotenter.text2sql.auth.dto.request.SignUpRequest;
import cmdotenter.demo.text2sql.dto.request.CreateUserRequest;

import java.util.List;

public interface UserService {
    public void save(CreateUserRequest createUserRequest);
    public UserDTO findById(Long id);
    public List<UserDTO> findAll();
    public void deleteById(Long id);
    public void updateUserById(Long id, CreateUserRequest createUserRequest);
}
