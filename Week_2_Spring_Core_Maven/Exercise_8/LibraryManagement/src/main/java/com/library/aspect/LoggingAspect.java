package com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
    @Before("execution(* com.library.service.BookService.manageBooks(..))")
    public void beforeManagingBooks() {
        System.out.println("Before managing books...");
    }

    @After("execution(* com.library.service.BookService.manageBooks(..))")
    public void afterManagingBooks() {
        System.out.println("After managing books...");
    }
}
