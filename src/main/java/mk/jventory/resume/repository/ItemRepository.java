package mk.jventory.resume.repository;

import mk.jventory.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {

}
