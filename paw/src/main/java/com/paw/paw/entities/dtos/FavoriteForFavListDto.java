package com.paw.paw.entities.dtos;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavoriteForFavListDto {
          
    private int id;
    private int advertId;
    private List<String> images;
    private String name;
    private String gender;

    private String genus;

    private String category;

    private  int age;

    private  String city;

    private String district;
}