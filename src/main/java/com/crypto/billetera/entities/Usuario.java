package com.crypto.billetera.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String DNI;
    private String Sexo;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Telefono;
    @OneToMany
    private List<Billetera> billetera;
}
