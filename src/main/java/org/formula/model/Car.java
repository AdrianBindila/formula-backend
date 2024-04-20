package org.formula.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    @OneToOne
    private Constructor constructor;
}
