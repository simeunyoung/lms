package kr.co.rmsoft.component;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BookHistoryDTO {
	private int num;
	private int book_num;
	private String title;
	private String id;
	private String rental;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss a", timezone = "Asia/Seoul")
	private Date rental_reg;
	private String back;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss a", timezone = "Asia/Seoul")
	private Date back_reg;
}
