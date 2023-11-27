package com.paw.paw.dataAccess;

import com.paw.paw.entities.concretes.Advert;
import com.paw.paw.entities.dtos.AdvertDetailDto;
import com.paw.paw.entities.dtos.AdvertForAdvertListDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdvertDao extends JpaRepository<Advert,Integer> {

    @Query(value = "Select new com.paw.paw.entities.dtos.AdvertForAdvertListDto(ad.id,ad.images,ad.name,ad.gender,ad.genus,ca.category,ad.age,ad.city,ad.district) From Advert as ad inner join Category as ca on ca.id = ad.categoryid")
    List<AdvertForAdvertListDto> getAdvertList();

    @Query(value = "Select new com.paw.paw.entities.dtos.AdvertForAdvertListDto(ad.id,ad.images,ad.name,ad.gender,ad.genus,ca.category,ad.age,ad.city,ad.district) From Advert as ad inner join Category as ca on ca.id = ad.categoryid where ad.categoryid =:categoryId")
    List<AdvertForAdvertListDto> getAdvertFilterByCategory(int categoryId);

    @Query(value = "Select new com.paw.paw.entities.dtos.AdvertForAdvertListDto(ad.id,ad.images,ad.name,ad.gender,ad.genus,ca.category,ad.age,ad.city,ad.district) From Advert as ad inner join Category as ca on ca.id = ad.categoryid where Lower(ad.genus) LIKE %:searchText%")
    List<AdvertForAdvertListDto> getAdvertFilterBySearchText(String searchText);
   
    @Query(value = "Select new com.paw.paw.entities.dtos.AdvertDetailDto(ad.id,ad.images,ad.name,ad.gender,ad.genus,ca.category,ad.age,ad.city,ad.district,ad.about,u.id,u.image,u.name,u.surname) From Advert as ad inner join Category as ca on ca.id = ad.categoryid inner join User as u on u.id = ad.userid where ad.id =:id")
    AdvertDetailDto getAdvertDetail(int id);

     @Query(value = "Select new com.paw.paw.entities.dtos.AdvertForAdvertListDto(ad.id,ad.images,ad.name,ad.gender,ad.genus,ca.category,ad.age,ad.city,ad.district) From Advert as ad inner join Category as ca on ca.id = ad.categoryid where Lower(ad.genus) LIKE %:searchText% and ad.categoryid =:categoryId")
    List<AdvertForAdvertListDto> getAdvertFilterByCategoryAndSearchText(int categoryId,String searchText);
}
