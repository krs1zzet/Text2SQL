package cmdotenter.demo.controllerTest;

import cmdotenter.demo.features.sqlConverter.controller.UserController;
import cmdotenter.demo.features.sqlConverter.dto.UserDTO;
import cmdotenter.demo.features.sqlConverter.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserControllerTest { // Class adı büyük harfle başladı

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this); // Mocks'ları aktif hale getiriyoruz
    }

    @Test
    void testGetAllUsers() {
        // Mock veriler oluştur
        UserDTO user1 = new UserDTO();
        user1.setId(1L);
        user1.setEmail("test1@example.com");

        UserDTO user2 = new UserDTO();
        user2.setId(2L);
        user2.setEmail("test2@example.com");

        List<UserDTO> mockUserList = Arrays.asList(user1, user2);

        // userService.findAll() çağrıldığında mock listeyi döndür
        when(userService.findAll()).thenReturn(mockUserList);

        // Controller'ın metodunu çağır
        ResponseEntity<List<UserDTO>> response = userController.getAllUsers();

        // Sonuçları doğrula
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(2, response.getBody().size());
        assertEquals("test1@example.com", response.getBody().get(0).getEmail());
    }
}
