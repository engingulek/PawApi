package com.paw.paw.entities.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Types;
import java.util.List;

import org.hibernate.annotations.JdbcType;
import org.hibernate.annotations.JdbcTypeCode;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Data
@Entity
@Table(name = "adverts")
@AllArgsConstructor
@NoArgsConstructor
public class Advert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @Column(name = "images")
    private  List<String> images;

    @Column(name = "name")
    private String name;

    @Column(name = "genus")
    private String genus;

    @Column(name = "categoryid")
    private int categoryid;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "city")
    private String city;

    @Column(name = "about")
    private String about;

    @Column(name = "userid")
    private int userid;








}
