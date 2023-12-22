package com.paw.paw.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


import lombok.*;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertDetailDto {


    public  int id;

   public  List<String>  images;
   public  String name;
   public  String gender;

   public  String genus;

   public  String category;

  public    int age;

   public   String city;

   public   String about;

  public   int  userId;

  public   String userImage;

 public     String userName;

   public   String userSurname;

public Boolean favStatus;
}
