package lt.codeacademy.javau8.archyvas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocService {


        DocumentRepository docrepo;

    public DocService(DocumentRepository docrepo) {
        this.docrepo = docrepo;
    }
    public List<DocEntity> getAll() {
        return docrepo.findAll();
    }

    public DocEntity addDocEntity(DocEntity docEntity) {
        return docrepo.save(docEntity);
    }

    public Optional<DocEntity> findById(long id) {

        return docrepo.findById(id);
    }
    public void deleteById(long id)
    {
        docrepo.deleteById(id);
    }
    public void save(DocEntity docEntity)
    {
        docrepo.save(docEntity);
    }

}

