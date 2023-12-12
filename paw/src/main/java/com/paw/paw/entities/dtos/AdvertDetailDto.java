package com.paw.paw.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertDetailDto {

    private  int id;

    private byte[] images;
    private String name;
    private String gender;

    private String genus;

    private String category;

    private  int age;

    private  String city;


    private  String about;

    private int  userId;

    private String userImage;

    private  String userName;

    private  String userSurname;

    private Boolean favStatus;
}
