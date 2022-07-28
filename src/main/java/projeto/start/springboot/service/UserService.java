package projeto.start.springboot.service;

import projeto.start.springboot.model.User;
import projeto.start.springboot.web.dto.UserRegistrationDto;

public interface UserService {
	
	User save(UserRegistrationDto registrationDto);

}
