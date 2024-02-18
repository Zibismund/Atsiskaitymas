package lt.codeacademy.javau8.archyvas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    OrderRepository repo;
    @Autowired
    DocumentRepository docrepo;


    @Override
    public void run(String... args) throws Exception {
        sarasas();
    }


    public void sarasas() {





        DocEntity doc1 = new DocEntity("K-1, ap.58, b. 125");
        docrepo.save(doc1);
        DocEntity doc2 = new DocEntity("K-1, ap.58, b. 126");
        docrepo.save(doc2);
        DocEntity doc3 = new DocEntity("K-1, ap.58, b. 127");
        docrepo.save(doc3);
        DocEntity doc4 = new DocEntity("K-1, ap.58, b. 128");
        docrepo.save(doc4);
        DocEntity doc5 = new DocEntity("K-1, ap.58, b. 129");
        docrepo.save(doc5);
        DocEntity doc6 = new DocEntity("K-1, ap.58, b. 130");
        docrepo.save(doc6);
        DocEntity doc7 = new DocEntity("K-1, ap.58, b. 131");
        docrepo.save(doc7);

        DocEntity operatyv1 = new DocEntity("K-11, ap. 1, b. 546");
        DocEntity operatyv2 = new DocEntity("K-11, ap. 1, b. 547");
        DocEntity operatyv3 = new DocEntity("K-11, ap. 1, b. 548");
        DocEntity operatyv4 = new DocEntity("K-11, ap. 1, b. 549");
        DocEntity operatyv5 = new DocEntity("K-11, ap. 1, b. 550");
        DocEntity operatyv6 = new DocEntity("K-11, ap. 1, b. 551");
        DocEntity operatyv7 = new DocEntity("K-11, ap. 1, b. 552");

        docrepo.save(operatyv1);
        docrepo.save(operatyv2);
        docrepo.save(operatyv3);
        docrepo.save(operatyv4);
        docrepo.save(operatyv5);
        docrepo.save(operatyv6);
        docrepo.save(operatyv7);





        OrderEntity order1 = new OrderEntity("Paulauskas", "2023-01-21","atvyks");
        OrderEntity order2=  new OrderEntity("Jonaitiene", "2023-01-23", "uzsakys kopijas");
        OrderEntity order3= new OrderEntity("Jucas", "2023-01-26","atvyks");
        OrderEntity order4 = new OrderEntity("Juzelskaite", "2023-01-27","nores pazymos");
        OrderEntity order5 = new OrderEntity("Dzeveckas", "2023-01-28","atvyks");
        OrderEntity order6 = new OrderEntity("Jankauskas", "2023-01-28","uzsakys kopijas");
        OrderEntity order7 = new OrderEntity("Antanaitis", "2023-01-29","atvyks");



        order1.addDocument(doc1);
        order1.addDocument(operatyv1);


        repo.save(order1);
        repo.save(order2);
        repo.save(order3);
        repo.save(order4);
        repo.save(order5);
        repo.save(order6);
        repo.save(order7);
        
    }
}



