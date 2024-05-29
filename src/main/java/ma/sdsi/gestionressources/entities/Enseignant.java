package ma.sdsi.gestionressources.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;



@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Enseignant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prenom;
    private String nom;
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToOne(mappedBy = "chefDepartement")
    private Departement departement;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "idChefDepartement")
    private Enseignant chefDepartement;

//    @OneToMany(mappedBy = "chefDepartement")
//    private List<Enseignant> enseignantsSousResponsabilite;
   @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "enseignant")
    private List<Demande> demandes;

    @OneToMany(mappedBy = "enseignant")
    private List<Ressource> ressourceList;

    @OneToMany(mappedBy = "enseignant")
    private List<Panne> pannes;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToOne
    @JoinColumn(name = "user_id") // Indique que la clé étrangère se trouve dans `Enseignant`
    private User user; // Relation OneToOne avec `User`


}
