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
@Table(name="classes")

public class Classe implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="classe_id")
    private long classeId;
	
	@Column(name="libele")
	private long libele;

}
