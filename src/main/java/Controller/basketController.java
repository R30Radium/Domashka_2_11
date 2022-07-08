package Controller;

import Service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shoplist")
public class basketController {

    private final Service service;

    public basketController(Service service) {
        this.service = service;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> ids) {
        return service.addItems(ids);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return service.getItems();
    }
}







