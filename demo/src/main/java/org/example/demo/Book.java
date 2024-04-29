package org.example.demo;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "books")
@Getter
public class Book {

    @Id
    private String id;
    private String title;
    private String author;
    private String category;
}
