package lt.codeacademy.javau8.archyvas;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


    @Entity
    public class OrderEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;

        String clientSurname;

        String orderDate;
        String orderNotes;

        public OrderEntity(){}

        public OrderEntity(Long id, String clientSurname, String orderDate, String orderNotes) {
            this.id = id;
            this.clientSurname = clientSurname;
            this.orderDate = orderDate;
            this.orderNotes = orderNotes;

        }

        public OrderEntity(String clientSurname, String orderDate, String orderNotes) {
            this.clientSurname = clientSurname;
            this.orderDate = orderDate;
            this.orderNotes = orderNotes;

        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getClientSurname() {
            return clientSurname;
        }

        public void setClientSurname(String clientSurname) {
            this.clientSurname = clientSurname;
        }

        public String getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
        }

        public String getOrderNotes() {
            return orderNotes;
        }

        public void setOrderNotes(String orderNotes) {
            this.orderNotes = orderNotes;
        }



        @Override
        public String toString() {
            return clientSurname + ", " +  "[" + orderDate + "]";
        }


    }



