package cmdotenter.demo.sqlConverter.controller;

import cmdotenter.demo.sqlConverter.dto.UserDTO;
//import cmdotenter.text2sql.auth.dto.request.SignUpRequest;
import cmdotenter.demo.sqlConverter.dto.request.createRequests.CreateUserRequest;
import cmdotenter.demo.sqlConverter.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
         List<UserDTO> userDTOList = userService.findAll();
         log.info("Find all users");
         return ResponseEntity.ok(userDTOList);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        UserDTO userDTO = userService.findById(id);
        log.info("Find user by id");
        return ResponseEntity.ok(userDTO);
    }

    @PostMapping("/user")
    public ResponseEntity<Void> createUser(@RequestBody CreateUserRequest createUserRequest) {
        userService.save(createUserRequest);
        log.info("User saved");
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
        log.info("User deleted");
        return ResponseEntity.ok().build();
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Long id, @RequestBody CreateUserRequest createUserRequest) {
        userService.updateUserById(id, createUserRequest);
        return ResponseEntity.ok().build();
    }










}
