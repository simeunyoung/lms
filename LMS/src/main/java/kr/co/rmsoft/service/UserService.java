package kr.co.rmsoft.service;

import java.util.List;

import kr.co.rmsoft.component.UserDTO;

public interface UserService {
	public UserDTO getUser(String userid);
	public List<UserDTO> getUserList();
	public void insertUser(UserDTO user);
	public void updateUser(UserDTO user, String userid);
	public void deleteUser(String userid);
}
