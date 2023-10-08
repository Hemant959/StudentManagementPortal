package com.Hemant.Student_Management_System.repo;

import com.Hemant.Student_Management_System.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,String>{

}
