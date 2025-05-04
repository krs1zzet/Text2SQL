package cmdotenter.demo.features.sqlConverter.dto.request.createRequests;

import cmdotenter.demo.features.sqlConverter.dto.request.BaseUserRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CreateUserRequest extends BaseUserRequest {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public CreateUserRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateUserRequest() {
    }


}
