package kr.co.rmsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.rmsoft.component.UserDTO;
import kr.co.rmsoft.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/users/{userid}")
	public UserDTO getUser(@PathVariable String userid) {
		UserDTO user = userService.getUser(userid);
		return user;
	}

	@GetMapping("/users")
	public List<UserDTO> getUsers(){
		 List<UserDTO> userList = userService.getUserList();
		 return userList;
	}

	// 회원가입
	@PostMapping("/users")
	public Boolean insertUser(@RequestBody UserDTO user) {
		if(user !=null) {
			userService.insertUser(user);
			return Boolean.TRUE;
		}else {
			return Boolean.FALSE;
		}
	}

	// 회원정보 수정
	@PatchMapping("/users/{userid}")
	public Boolean updateUser(@RequestBody UserDTO user,@PathVariable String userid) {
		if(user!=null) {
			userService.updateUser(user, userid);
			return Boolean.TRUE;
		}else {
			return Boolean.FALSE;
		}

	}

	// 회원탈퇴
	@DeleteMapping("/users/{id}")
	public Boolean deleteUser(@PathVariable("id") String userid) {
		if(userid!=null) {
			userService.deleteUser(userid);
			return Boolean.TRUE;
		}else {
			return Boolean.FALSE;
		}
	}

}
