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

    @DeleteMapping("/entity/delete/{id}")
    public String deleteOrderEntity(@PathVariable Long id) {

        service.deleteById(id);
        return "Deleted entity id - " + id;
    }


    @PutMapping("/entity/change/{id}")
    public String updateOrderEntity(@PathVariable Long id, @RequestBody OrderEntity orderEntity) {
        OrderEntity updatedorderEntity = service.findById(id).get();

        updatedorderEntity.setClientSurname(orderEntity.getClientSurname());
        updatedorderEntity.setOrderDate(orderEntity.getOrderDate());
        updatedorderEntity.setOrderNotes(orderEntity.getOrderNotes());
        service.save(orderEntity);

        return "updated";

    }
}