package lt.codeacademy.javau8.archyvas;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/document/")
public class DocController {

    DocService docservice;

    public DocController(DocService docservice) {
        this.docservice = docservice;
    }

    @GetMapping("/entity")
    public List<DocEntity> getAll() {
        return docservice.getAll();
    }


    @GetMapping("/entity/{id}")
    public Optional<DocEntity> findOne(@PathVariable long id) {
        return docservice.findById(id);

    }


    @PostMapping("/add")
    public DocEntity saveOrderEntity(@RequestBody DocEntity docEntity) {
        return docservice.addDocEntity(docEntity);
    }


    @DeleteMapping("/entity/delete/{id}")
    public String deleteDocEntity(@PathVariable Long id) {

        docservice.deleteById(id);
        return "Deleted doc id - " + id;
    }


    @PutMapping("/entity/change/{id}")
    public String updateOrderEntity (@PathVariable Long id, @RequestBody DocEntity docEntity) {
        DocEntity updateddocEntity =docservice.findById(id).get();

        updateddocEntity.setDocument(docEntity.getDocument());

        docservice.save(docEntity);

        return "updated";

    }

}
