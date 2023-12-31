package kr.co.rmsoft.component;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BookListDTO {
	private int num;
	private String title;
	private String writer;
	private String publisher;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss a", timezone = "Asia/Seoul")
	private Timestamp reg;
}
