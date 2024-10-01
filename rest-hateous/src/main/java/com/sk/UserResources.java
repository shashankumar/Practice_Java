package com.sk;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.sk.model.Users;

@RestController
@RequestMapping("/rest/users")
public class UserResources {
	
	@GetMapping("/all")
	public List<Users> getAll(){
		Users users1= new Users("Shashank",2000000L);
		Users users2= new Users("Shashank1",2000000L);
		
		return Arrays.asList(users1,users2);
		
	}

}
