package kodlamaio.Hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.VerificationCodeService;

@RestController
@RequestMapping("/verify")
public class VerificationCodeController {
	private VerificationCodeService verificationCodeService;

	@Autowired
	public VerificationCodeController(VerificationCodeService verificationCodeService) {
		super();
		this.verificationCodeService = verificationCodeService;
	}
	
	@GetMapping("/deneme")
	public void sendMail(String mail) {
		 this.verificationCodeService.sendMail(mail);
	}
}
