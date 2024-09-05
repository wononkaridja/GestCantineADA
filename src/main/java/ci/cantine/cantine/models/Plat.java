package ci.cantine.cantine.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor

public class Plat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Summary")
    private String summary;





}
