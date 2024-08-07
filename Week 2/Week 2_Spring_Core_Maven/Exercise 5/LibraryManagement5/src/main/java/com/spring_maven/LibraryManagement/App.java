package com.spring_maven.LibraryManagement;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookService bs = (BookService) context.getBean("bookService");
        bs.bookServiceShow();
    }
}
