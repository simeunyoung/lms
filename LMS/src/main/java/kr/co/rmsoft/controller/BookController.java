package kr.co.rmsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.rmsoft.component.BookHistoryDTO;
import kr.co.rmsoft.component.BookListDTO;

import kr.co.rmsoft.service.BookService;


@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	// 도서 등록
	@PostMapping("/books")
	public Boolean insertBook(@RequestBody BookListDTO book) {
		if(book !=null) {
			bookService.insertBook(book);
			return Boolean.TRUE;
		}else {
			return Boolean.FALSE;
		}
	}

	// 도서 수정
	@PatchMapping("/books/{number}")
	public Boolean updateUser(@RequestBody BookListDTO book,@PathVariable String number) {
		if(number!=null) {
			bookService.updateBook(book, number);
			return Boolean.TRUE;
		}else {
			return Boolean.FALSE;
		}

	}
	
	// 도서에 대한 대출이력
	@RequestMapping("/history/{number}")
	public BookHistoryDTO getBookHistory(@PathVariable String number) {
		BookHistoryDTO history = bookService.getBookHistory(number);
		return history;
	}
	
	// 대출 등록
	@PostMapping("/history")
	public Boolean rentalBook(@RequestBody BookHistoryDTO history) {
		if(history !=null) {
			bookService.rentalBook(history);
			return Boolean.TRUE;
		}else {
			return Boolean.FALSE;
		}
	}

	// 반납
	@PatchMapping("/history/{number}")
	public Boolean backBook(@RequestBody BookHistoryDTO history,@PathVariable String number) {
		if(number!=null) {
			bookService.backBook(history, number);
			return Boolean.TRUE;
		}else {
			return Boolean.FALSE;
		}
	}
	
}
