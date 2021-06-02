package kodlamaio.Hrms.entities.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "User Data Transfer Object")
public class UserDto {

    @ApiModelProperty(required = true, value = "Email")
    private String email;
    @ApiModelProperty(required = true, value = "Password")
    private String password;
}