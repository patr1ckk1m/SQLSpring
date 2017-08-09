package com.patrick.sqlbookdemo.models;
import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;


import org.springframework.format.annotation.DateTimeFormat;

public class Book {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    @Size(min = 5, max = 200)
    private String title;
    

    @Column
    @Size(min = 5, max = 200)
    private String description;
    
    @Column
    @Size(min = 3, max = 40)
    private String language;
    
    @Column
    @Min(100)
    private int numberOfPages;

    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date created_at;

    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updated_at;
}
