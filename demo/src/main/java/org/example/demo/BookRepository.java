package org.example.demo;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Book, String> {
    List<Book> findAllByTitle(String title);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"title\": \"*?0*\"}}]}}")
    List<Book> findAllByTitleContainingCustomQuery(String keyword);
}
