package org.formula.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Driver {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long number;
    @ManyToOne
    private Constructor constructor;
}
