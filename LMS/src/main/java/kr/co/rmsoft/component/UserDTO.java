package kr.co.rmsoft.component;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class UserDTO {
	private String id;
	private String pw;
	private String name;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss a", timezone = "Asia/Seoul")
	private Date reg;
}
