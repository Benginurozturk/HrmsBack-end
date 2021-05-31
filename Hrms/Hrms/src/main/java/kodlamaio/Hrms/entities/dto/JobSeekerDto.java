package kodlamaio.Hrms.entities.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "Job Seeker Data Transfer Object")
public class JobSeekerDto {

    @ApiModelProperty(required = true, value = "First Name")
    private String firstName;
    @ApiModelProperty(required = true, value = "Sur Name")
    private String surName;
    @ApiModelProperty(required = true, value = "National Identification Number")
    private Long nationalId;
    @ApiModelProperty(required = true, value = "Birth Date")
    private int birthDate;
    @ApiModelProperty(required = true, value = "Email")
    private String email;
    @ApiModelProperty(required = true, value = "Password")
    private String password;
    


}