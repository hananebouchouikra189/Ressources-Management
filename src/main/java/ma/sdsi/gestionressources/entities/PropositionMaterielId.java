package ma.sdsi.gestionressources.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data @AllArgsConstructor @NoArgsConstructor
public class PropositionMaterielId implements Serializable{

	 private Long ressource;
	 private Long proposition;

}
