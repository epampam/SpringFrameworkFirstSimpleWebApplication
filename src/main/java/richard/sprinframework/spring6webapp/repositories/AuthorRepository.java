package richard.sprinframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import richard.sprinframework.spring6webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
