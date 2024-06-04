package com.noah.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("books")
public class LibraryController {
    @Autowired
    private LibraryRepo ls;

    @GetMapping("/all")
    public String getAllBooks() {
        List<Book> books = ls.findAll();

        return books.toString();
    }
}
