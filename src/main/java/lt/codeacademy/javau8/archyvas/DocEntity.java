package lt.codeacademy.javau8.archyvas;

import jakarta.persistence.*;

@Entity
public class DocEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String document;
    @ManyToOne
    @JoinColumn(name = "orderEntity_id")
    private OrderEntity orderEntity;

    public DocEntity(){}

    public DocEntity(Long id, String document) {
        this.id = id;
        this.document = document;

    }

    public DocEntity(String document) {
        this.document = document;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }


}



