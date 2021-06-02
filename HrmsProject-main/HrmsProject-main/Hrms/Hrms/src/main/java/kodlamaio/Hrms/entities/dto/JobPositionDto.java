package kodlamaio.Hrms.entities.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

//Data Transfer Object'lerde başka bir anotasyona gerek yok bildiğim kadarıyla
@Data
@ApiModel(value = "Job Position Data Transfer Object")
public class JobPositionDto {

    @ApiModelProperty(required = true, value = "Job Position Name")
    private String title;

}
