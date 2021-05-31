package kodlamaio.Hrms.entities.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel(value = "Employer Data Transfer Object")
//swagger açıklaması
public class EmployerDto {

    //Her Employer bir userdır.
    //Her User bir employer değildir.
    //Bu yüzden employer eklerken user da eklemem gerekiyor
    //Bu Dtoda employer için gerekli bilgiler olduğu gibi user için gerekli bilgiler de bulunuyor.
    //Ekleme işlemlerini bu Dtodaki fieldlara göre yapıyorum.
    //Database'e eklelemek içinse ModelMapper kullanıyorum.
    //Bunun yerinde getter ve setterlar kullanılabilir.
    //Aynı şey bütün tablolar için geçerlidir.

    @ApiModelProperty(required = true, value = "Company Name")
    //swagger açıklaması
    private String companyName;
    @ApiModelProperty(required = true, value = "webaddress with www.")
    private String webaddress;
    @ApiModelProperty(required = true, value = "phoneno")
    private Long phoneno;
    @ApiModelProperty(required = true, value = "Email")
    private String email; //Employer entity'sinde böyle bir bilgi yok. Bu bilgi User entitysinden gelecek.
    @ApiModelProperty(required = true, value = "Password")
    private String password; //Employer entity'sinde böyle bir bilgi yok. Bu bilgi User entitysinden gelecek.
}   