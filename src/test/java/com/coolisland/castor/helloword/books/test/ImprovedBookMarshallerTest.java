package com.coolisland.castor.helloword.books.test;

import org.apache.log4j.Logger;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.coolisland.castor.helloworld.books.ImprovedBook;

public class ImprovedBookMarshallerTest {
	static Logger logger = Logger.getLogger(ImprovedBookMarshallerTest.class);

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:castor-books-spring-app-context.xml");
		ctx.refresh();

		try {
			ImprovedBook book = (ImprovedBook) ctx.getBean("bookExample");

			logger.debug("book: " + book);

			book.marshaller();

			logger.debug("after marshaller");

		} finally {
			ctx.close();
		}
	}

}
