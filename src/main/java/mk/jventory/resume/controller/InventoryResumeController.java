package mk.jventory.resume.controller;

import lombok.RequiredArgsConstructor;
import mk.jventory.common.Constants;
import mk.jventory.model.Item;
import mk.jventory.resume.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Constants.API_ROOT + "/resume")
@RequiredArgsConstructor
public class InventoryResumeController {

    private final ItemService itemService;

    @GetMapping
    public ResponseEntity<List<Item>> getAll() {
        return new ResponseEntity<>(itemService.getAll(), HttpStatus.OK);
    }

}
