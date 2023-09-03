package kr.co.rmsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rmsoft.component.BookHistoryDTO;
import kr.co.rmsoft.component.BookListDTO;
import kr.co.rmsoft.mapper.BookMapper;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookMapper mapper;
	
	public void insertBook(BookListDTO book) {
		mapper.insertBook(book);
	}
	
	public void updateBook(BookListDTO book, String number) {
		mapper.updateBook(book, number);
	}
	
	public void rentalBook(BookHistoryDTO history) {
		mapper.rentalBook(history);
	}
	
	public void backBook(BookHistoryDTO history, String number) {
		mapper.backBook(history,number);
	};
	
	public BookHistoryDTO getBookHistory(String number) {
		return mapper.getBookHistory(number);
	};
}
