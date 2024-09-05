package ci.cantine.cantine.models;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
@Table
@Entity
public class Menu {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    @Id
    @Column(name = "date_creation")
    private Date creationDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dish_id")
    private Plat plat;


}
