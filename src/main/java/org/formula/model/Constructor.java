package org.formula.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Constructor {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany
    private List<Driver> drivers;
    @OneToOne
    private Car car;
}
