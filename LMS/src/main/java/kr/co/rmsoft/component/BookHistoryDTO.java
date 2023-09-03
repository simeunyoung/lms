package kr.co.rmsoft.component;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;

@Data
public class BookHistoryDTO {
	private int num;
	private int book_num;
	private String title;
	private String id;
	private String rental;
	private Date rental_reg;
	private String back;
	private Date back_reg;
}
