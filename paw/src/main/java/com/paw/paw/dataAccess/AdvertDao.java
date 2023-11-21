package com.paw.paw.dataAccess;

import com.paw.paw.entities.concretes.Advert;
import com.paw.paw.entities.dtos.AdvertForAdvertListDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdvertDao extends JpaRepository<Advert,Integer> {

    @Query(value = "Select new com.paw.paw.entities.dtos.AdvertForAdvertListDto(ad.id,ad.images,ad.name,ad.gender,ad.genus,ca.category,ad.age,ad.city,ad.district) From Advert as ad inner join Category as ca on ca.id = ad.categoryid")
    List<AdvertForAdvertListDto> getAdvertList();
}
