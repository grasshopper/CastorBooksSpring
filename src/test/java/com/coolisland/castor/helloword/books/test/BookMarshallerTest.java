package com.coolisland.castor.helloword.books.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;

import com.coolisland.castor.helloworld.books.Book;

public class BookMarshallerTest {

	public Book loadBook() {
		Book book = null;

		try {
			FileReader xmlFile = new FileReader("books.xml");
			System.out.println("Ready: " + xmlFile.ready());

			book = (Book) Unmarshaller.unmarshal(Book.class, xmlFile);
			
			xmlFile.close();
		} catch (MarshalException | ValidationException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return book;
	}

	public void saveBook(Book book) {
		try {
			FileWriter xmlFile = new FileWriter("books.xml");

			Marshaller.marshal(book, xmlFile);
			
			xmlFile.flush();
			xmlFile.close();
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printBook(Book book) {
		System.out.println(book);
	}

	public static void main(String[] args) {
		BookMarshallerTest tester = new BookMarshallerTest();
		Book book = new Book("3340284923420934", "My first Castor Hello World",
				"Silvio Nunes");

		// save the book
		System.out.println("Saving book: ");
		tester.printBook(book);
		tester.saveBook(book);
		
		// read the book back in
//		book = tester.loadBook();
//		System.out.println("Read book: ");
//		tester.printBook(book);
	}

}
