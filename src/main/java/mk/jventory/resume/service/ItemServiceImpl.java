package mk.jventory.resume.service;

import lombok.RequiredArgsConstructor;
import mk.jventory.model.Item;
import mk.jventory.resume.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public List<Item> getAll() {
        return null;
    }

}
