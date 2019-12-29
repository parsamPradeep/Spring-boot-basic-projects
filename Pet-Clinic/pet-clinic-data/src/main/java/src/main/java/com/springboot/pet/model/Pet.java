package src.main.java.com.springboot.pet.model;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity{
	@ManyToOne
	@JoinColumn(name="type_id")
	private PetType petType;
	@ManyToOne
	@JoinColumn(name="owner_id")
	private Owner owner;
	@Column(name="name")
	private String name;
	@Column(name="birth_date")
	private LocalDate localdate;

	public PetType getPetType() {
		return petType;
	}
	public void setPetType(src.main.java.com.springboot.pet.model.PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getLocaldate() {
		return localdate;
	}
	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}

}
