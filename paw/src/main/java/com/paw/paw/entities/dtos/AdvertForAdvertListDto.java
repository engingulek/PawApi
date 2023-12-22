package com.paw.paw.entities.dtos;
import lombok.*;

import java.util.List;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AdvertForAdvertListDto {

  public   int id;

  public  List<String>  images;
  public  String name;
  public  String gender;

  public   String genus;

  public String category;

  public int age;

  public  String city;


}
