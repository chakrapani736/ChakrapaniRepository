package com.te.streams;

import java.util.*;
import java.util.stream.Collectors;

class Book{
	String name;
	String genre;
	public Book(String name, String genre) {
		super();
		this.name = name;
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Book [" + (name != null ? "name=" + name + ", " : "") + (genre != null ? "genre=" + genre : "") + "]";
	}
}
public class CollectionOfBooksByGenre {
	public static void main(String[] args) {
		List<Book>list=new ArrayList<>();
		list.add(new Book("ramayana", "devotional"));		
		list.add(new Book("ironman", "action"));		
		list.add(new Book("mahabharatha", "devotional"));		
		list.add(new Book("deadpool", "action"));		
		list.add(new Book("dora", "animation"));		
		list.add(new Book("captainAmerica", "action"));		
		list.add(new Book("hanuman", "devotional"));		
		list.add(new Book("jockyjohn", "animation"));		
		list.add(new Book("thor", "action"));	
		
		list.stream().filter(e->e.getGenre().equals("action")).forEach(System.out::println);
		
	}
	

}
