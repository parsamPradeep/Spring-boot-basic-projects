package pet.bootstrap;

import com.springboot.pet.services.OwnerService;
import com.springboot.pet.services.VetService;
import org.springframework.boot.CommandLineRunner;
import src.main.java.com.springboot.pet.model.Owner;
import src.main.java.com.springboot.pet.model.Vet;

public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerservice;
    private final VetService vetService;

    public DataLoader(OwnerService ownerservice, VetService vetService){

        this.ownerservice = ownerservice;
        this.vetService = vetService;
    }
    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstname("pradeep");
        owner1.setLastname("parsam");
         ownerservice.save(owner1);
        System.out.println("Loading Owner");
         Vet vet1=new Vet();
         vet1.setId(2L);
         vet1.setFirstname("jhon");
         vet1.setLastname("lee");
         vetService.save(vet1);
         System.out.println("loading Vets");
    }

}
