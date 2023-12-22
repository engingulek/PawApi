package com.paw.paw.entities.concretes;


import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;


    @Column(name = "images")
    private  String image;

    @Column(name = "name")
    private  String name;

    @Column(name = "surname")
    private  String surname;



}
