package com.te.hibernatemapping.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Book_Info")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String bookName;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="book_joining",insertable = true)
	private List<Author>listOfAuthors;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public List<Author> getListOfAuthors() {
		return listOfAuthors;
	}
	public void setListOfAuthors(List<Author> listOfAuthors) {
		this.listOfAuthors = listOfAuthors;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", " + (bookName != null ? "bookName=" + bookName + ", " : "")
				+ (listOfAuthors != null ? "listOfAuthors=" + listOfAuthors : "") + "]";
	}
	
	
	

}
