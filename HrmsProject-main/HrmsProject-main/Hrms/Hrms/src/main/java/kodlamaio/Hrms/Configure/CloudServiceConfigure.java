package kodlamaio.Hrms.Configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Configuration
public class CloudServiceConfigure {
	
	@Value("${cld.access-key}")
    String accessKey;
    @Value("${cld.secret-key}")
    String secretKey;
	

	
    @Bean
    public Cloudinary cloudinaryService(){
        return new Cloudinary(
                ObjectUtils.asMap(
                        "cloud_name","benginur", 
                        "api_key", "293214657381484",
                        "api_secret", "e5YeWXAsjL1f83TKJ6xbt8Z_JKc"
                )
        );
    }
}
