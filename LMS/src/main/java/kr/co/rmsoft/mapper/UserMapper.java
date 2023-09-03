package kr.co.rmsoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.co.rmsoft.component.UserDTO;

public interface UserMapper {

	public UserDTO getUser(String userid);
	public List<UserDTO> getUserList();
	public void insertUser(UserDTO user);
	public void updateUser(@Param("user") UserDTO user, @Param("userid") String userid);
	public void deleteUser(String userid);
}
