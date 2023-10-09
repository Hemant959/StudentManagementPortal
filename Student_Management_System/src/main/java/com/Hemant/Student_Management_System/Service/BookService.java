package com.Hemant.Student_Management_System.Service;

import com.Hemant.Student_Management_System.model.Book;
import com.Hemant.Student_Management_System.repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo iBookRepo;

    public String addBook(Book newBook) {
        iBookRepo.save(newBook);
        return "added";
    }

    public List<Book> getAllBook() {
        return iBookRepo.findAll();
    }

    public String UpdateBookById(String id, String title) {
        Book book = iBookRepo.findById(id).orElse(null);
        if(book != null){
            book.setTitle(title);
            iBookRepo.save(book);
            return "Book data updated Successful";
        }
        return "Book Does not exist";
    }

    public String deleteBookById(String id) {
        iBookRepo.deleteById(id);
        return "Record Deleted";
    }
}
