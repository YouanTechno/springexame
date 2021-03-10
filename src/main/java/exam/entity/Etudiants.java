package exam.entity;
import java.io.Serializable;

//Classe pour creation de table article


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="etudiants")

public class Etudiants implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="etudiant_id")
    private long etudiantId;
	
	@Column(name="nom")
    private String nom; 
	@Column(name="prenom")
    private String prenom;
	@Column(name="matricul")
	private String matricul;
	@Column (name="datenais")
	private String datenais;
	@Column (name="lieunais")
	private String lieunais;

}
