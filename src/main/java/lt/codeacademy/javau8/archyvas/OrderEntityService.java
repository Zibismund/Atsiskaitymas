package lt.codeacademy.javau8.archyvas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderEntityService {

    OrderRepository repo;

    public OrderEntityService(OrderRepository repo) {

        this.repo = repo;
    }

    public List<OrderEntity> getAll() {
        return repo.findAll();
    }

    public OrderEntity addOrderEntity(OrderEntity orderEntity) {
        return repo.save(orderEntity);
    }

    public Optional<OrderEntity> findById(long id) {

        return repo.findById(id);
    }


}
