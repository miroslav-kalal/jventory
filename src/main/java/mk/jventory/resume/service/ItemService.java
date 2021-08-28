package mk.jventory.resume.service;

import mk.jventory.model.Item;
import org.springframework.lang.NonNull;

import java.util.List;

public interface ItemService {

    @NonNull
    List<Item> getAll();

}
