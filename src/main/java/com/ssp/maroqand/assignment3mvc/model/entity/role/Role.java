package com.ssp.maroqand.assignment3mvc.model.entity.role;

import com.ssp.maroqand.assignment3mvc.model.entity.Customer;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "role_name")
    private String roleName;

    @OneToOne(mappedBy = "role",cascade = CascadeType.ALL)
    private Customer customer;

    @OneToMany(mappedBy = "role")
    private Set<Priviliges> priviliges;



}
