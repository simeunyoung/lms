package kr.co.rmsoft.mapper;

import org.apache.ibatis.annotations.Param;

import kr.co.rmsoft.component.BookHistoryDTO;
import kr.co.rmsoft.component.BookListDTO;

public interface BookMapper {
	public void insertBook(BookListDTO book);
	public void updateBook(@Param ("book")BookListDTO book, @Param("number") String number);
	public void rentalBook(BookHistoryDTO history);
	public void backBook(@Param ("history")BookHistoryDTO history, @Param("number") String number);
	public BookHistoryDTO getBookHistory(String number);
}
