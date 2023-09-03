package kr.co.rmsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rmsoft.component.UserDTO;
import kr.co.rmsoft.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper mapper;
	
	public UserDTO getUser(String userid) {
		return mapper.getUser(userid);
	};
	
	public List<UserDTO> getUserList(){
		return mapper.getUserList();
	}
	
	public void insertUser(UserDTO user) {
		mapper.insertUser(user);
	};
	
	public void updateUser(UserDTO user, String userid) {
		mapper.updateUser(user, userid);
	};
	
	public void deleteUser(String userid) {
		mapper.deleteUser(userid);
	};
}
