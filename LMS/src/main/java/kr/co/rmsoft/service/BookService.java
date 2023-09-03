package kr.co.rmsoft.service;

import kr.co.rmsoft.component.BookHistoryDTO;
import kr.co.rmsoft.component.BookListDTO;

public interface BookService {
	public void insertBook(BookListDTO book);
	public void updateBook(BookListDTO book, String number);
	public void rentalBook(BookHistoryDTO history);
	public void backBook(BookHistoryDTO history, String number);
	public BookHistoryDTO getBookHistory(String number);
}
