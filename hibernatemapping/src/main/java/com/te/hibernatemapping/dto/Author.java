package com.te.hibernatemapping.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Author_Info")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authorId;
	private String authorName;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Book>listOfBook;
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public List<Book> getListOfBook() {
		return listOfBook;
	}
	public void setListOfBook(List<Book> listOfBook) {
		this.listOfBook = listOfBook;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", " + (authorName != null ? "authorName=" + authorName + ", " : "")
				+ (listOfBook != null ? "listOfBook=" + listOfBook : "") + "]";
	}
	

}
