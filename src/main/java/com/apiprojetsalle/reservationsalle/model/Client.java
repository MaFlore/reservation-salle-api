package com.apiprojetsalle.reservationsalle.model;



import javax.persistence.*;
import java.util.Set;


@Entity
@DiscriminatorValue("Client")
@Table(name = "clients")
public class Client extends Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/*Ajout de la relation OneToMany entre Client et Reservation*/
	@OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
	private Set<Reservation> reservations;

}
