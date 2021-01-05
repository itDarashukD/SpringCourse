package org.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Преступление и наказание")
    private String name;
    @Value("Достоевский")
    private String author;
    @Value("1866")
    private int yearOfPublished;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }
}
