package richard.sprinframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import richard.sprinframework.spring6webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
