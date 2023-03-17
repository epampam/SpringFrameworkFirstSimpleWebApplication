package richard.sprinframework.spring6webapp.services;

import richard.sprinframework.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
