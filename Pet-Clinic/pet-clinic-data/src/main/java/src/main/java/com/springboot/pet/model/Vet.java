package src.main.java.com.springboot.pet.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "vets")
public class Vet extends Person {
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="vet_specialities",joinColumns=@JoinColumn(name="vet_id"),inverseJoinColumns = @JoinColumn(name="specialities_id"))
    private Set<Specialities> specialitiesSet=new HashSet<>();

}
