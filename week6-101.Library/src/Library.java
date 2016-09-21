/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.ArrayList;
import java.util.*;

public class Library {
    
    private ArrayList<Book> Books;
    
    public Library() {
        
        this.Books = new ArrayList<Book>();
        
    }
    
    public void addBook(Book newBook) {
        
        Books.add(newBook);
        
    }
    
    public void printBooks() {
        
        for (Book Book1 : Books) {
            System.out.println(Book1);
        }
        
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> fBook = new ArrayList<Book>();
        
        for (Book book1 : Books) {
            if (StringUtils.included(book1.title(), title)) {
                fBook.add(book1);
            }
            
        }
        return fBook;
    }
    
    public ArrayList<Book> searchByPublisher(String Publisher) {
        
        ArrayList<Book> fPublisher = new ArrayList<Book>();
        for (Book book1 : Books) {
            if (StringUtils.included(book1.publisher(), Publisher)) {
                fPublisher.add(book1);
            }
            
        }
        return fPublisher;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        
        ArrayList<Book> fYear = new ArrayList<Book>();
        for (Book book1 : Books) {
            if (book1.year() == year) {
                fYear.add(book1);
            }
        }
        return fYear;
        
    }
    
    public static boolean included(String word, String searched) {
        
        if (word.contains(searched)) {
            return true;
        }
        
        return false;
        
    }
    
}
