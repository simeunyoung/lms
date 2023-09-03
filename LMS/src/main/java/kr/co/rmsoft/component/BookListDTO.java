package kr.co.rmsoft.component;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;

@Data
public class BookListDTO {
	private int num;
	private String title;
	private String writer;
	private String publisher;
	private Timestamp reg;
}
