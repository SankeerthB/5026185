package com.example.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	BookService service=(BookService)context.getBean("bookService");
    	service.manageBooks();
    }
}