package exam.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="educateurs")

public class Edicateur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="educateur_id")
    private long educateurId;
	
	@Column(name="nom")
	private long nom;
	@Column(name="prenom")
	private long prenom;
	@Column(name="matricule")
	private long matricule;

}
