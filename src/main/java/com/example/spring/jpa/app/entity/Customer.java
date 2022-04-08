package com.example.spring.jpa.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customer {

    @javax.persistence.Id
    @GeneratedValue
    private int custId;
    private String name;
    private String email;
    private String gender;

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_pid" , referencedColumnName = "custId")
    private List<Product> products;
}
