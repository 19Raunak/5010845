package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;
 

public class LibraryManagementApp {
    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve the BookService bean from the context
        BookService bookService = (BookService) context.getBean("bookService");
        // Test the BookService
        bookService.getBookService();
        
    }
}
