package com.example.LibraryManagement;
import com.library.service.BookService;
import com.library.repository.BookRepository;
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
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	BookService service=(BookService)context.getBean("bookService");
    	service.manageBooks();
    	BookRepository repo=(BookRepository)context.getBean("bookRepository");
    	repo.fetchBooks();
    }
}
