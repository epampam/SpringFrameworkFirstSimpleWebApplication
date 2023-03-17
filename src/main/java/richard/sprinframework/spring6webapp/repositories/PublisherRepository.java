package richard.sprinframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import richard.sprinframework.spring6webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
