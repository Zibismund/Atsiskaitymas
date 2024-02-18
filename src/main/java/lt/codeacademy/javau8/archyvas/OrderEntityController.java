package lt.codeacademy.javau8.archyvas;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/")
public class OrderEntityController {


        OrderEntityService service;

    public OrderEntityController(OrderEntityService service) {
        this.service = service;
    }

    @GetMapping("/entity")
        public List<OrderEntity> getAll() {
            return service.getAll();
        }


        @GetMapping("/entity/{id}")
        public Optional<OrderEntity> findOne(@PathVariable long id) {
            return service.findById(id);

        }


        @PostMapping("/add")
        public OrderEntity saveOrderEntity(@RequestBody OrderEntity orderEntity) {
            return service.addOrderEntity(orderEntity);
        }

    }
