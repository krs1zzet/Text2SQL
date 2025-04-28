package cmdotenter.demo.sqlConverter.service.Impl;

import cmdotenter.demo.sqlConverter.dto.UserDTO;
import cmdotenter.demo.sqlConverter.dto.converter.UserDTOConverter;
//import cmdotenter.text2sql.auth.dto.request.SignUpRequest;
import cmdotenter.demo.sqlConverter.dto.request.createRequests.CreateUserRequest;
import cmdotenter.demo.sqlConverter.entity.User;
import cmdotenter.demo.sqlConverter.repo.UserRepository;
import cmdotenter.demo.sqlConverter.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserDTOConverter userDTOConverter;

    public UserServiceImpl(UserRepository userRepository, UserDTOConverter userDTOConverter) {
        this.userRepository = userRepository;
        this.userDTOConverter = userDTOConverter;
    }


    @Override
    public void save(CreateUserRequest createUserRequest) {
        User user = new User();
        user.setEmail(createUserRequest.getEmail());
        user.setPasswordHash(createUserRequest.getPassword());
        userRepository.save(user);
    }

    @Override
    public UserDTO findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        User userEntity = user.orElseThrow(() -> new RuntimeException("User not found"));
        return userDTOConverter.convert(userEntity);
    }

    @Override
    public List<UserDTO> findAll() {
        return userDTOConverter.convert(userRepository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            userRepository.delete(user.get());
        } else {
            throw new RuntimeException("User not found");
        }

    }

    @Override
    public void updateUserById(Long id, CreateUserRequest createUserRequest) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setEmail(createUserRequest.getEmail());
        user.setPasswordHash(createUserRequest.getPassword());
        userRepository.save(user);
    }

    @Override
    public User findByIdReturnUser(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
