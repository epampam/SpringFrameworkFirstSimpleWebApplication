package richard.sprinframework.spring6webapp.services;

import richard.sprinframework.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
