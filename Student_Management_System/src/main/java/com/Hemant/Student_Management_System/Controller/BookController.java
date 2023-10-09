package com.Hemant.Student_Management_System.Controller;

import com.Hemant.Student_Management_System.Service.BookService;
import com.Hemant.Student_Management_System.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("api/Book/post")
    public String addBook(@RequestBody Book newBook){
        return bookService.addBook(newBook);
    }
    @GetMapping("api/Book/Get")
    public List<Book>getAllBook(){
        return bookService.getAllBook();
    }
    @PutMapping("api/Book/put")
    public String UpdateBookById(@RequestParam String id,@RequestParam String title){
        return bookService.UpdateBookById(id,title);
    }
    @DeleteMapping("api/Book/put")
    public String deleteBookById(@RequestParam String id){
        return bookService.deleteBookById(id);
    }
}
