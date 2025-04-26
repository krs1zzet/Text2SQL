//package cmdotenter.text2sql.controllerTest;
//
//import cmdotenter.demo.text2sql.controller.UserController;
//import cmdotenter.demo.text2sql.dto.UserDTO;
//import cmdotenter.demo.text2sql.service.UserService;
//import org.junit.jupiter.api.BeforeEach;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.http.ResponseEntity;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//public class userControllerTest {
//
//    @Mock
//    private UserService userService;
//
//    @InjectMocks
//    private UserController userController;
//
//    @BeforeEach
//    void testGetAllUsers() {
//        UserDTO user1 = new UserDTO();
//        user1.setId(1L);
//        user1.setEmail("test@test.com");
//
//        UserDTO user2 = new UserDTO();
//        user2.setId(2L);
//        user2.setEmail("test2@test.com");
//
//        List<UserDTO> mockUserList = Arrays.asList(user1, user2);
//
//        when(userService.findAll()).thenReturn(mockUserList);
//
//        ResponseEntity<List<UserDTO>> response = userController.getAllUsers();
//
//        assertEquals(200, response.getStatusCodeValue());
//        assertEquals(2, response.getBody().size());
//        assertEquals("user1@example.com", response.getBody().get(0).getEmail());
//
//    }
//}
