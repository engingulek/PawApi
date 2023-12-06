package com.paw.paw.dataAccess;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.paw.paw.core.Result;
import com.paw.paw.entities.concretes.Favorite;
import com.paw.paw.entities.dtos.FavoriteForFavListDto;
import org.springframework.transaction.annotation.Transactional;

public interface FavoriteDao extends JpaRepository<Favorite,Integer> {

  @Query(value = "Select new com.paw.paw.entities.dtos.FavoriteForFavListDto(fav.id,ad.id,ad.images,ad.name,ad.gender,ad.genus,ca.category,ad.age,ad.city,ad.district) From Favorite as fav inner join Advert as ad on ad.id = fav.advertid inner join Category as ca on ca.id = ad.categoryid where fav.userid =:userId")
  List<FavoriteForFavListDto> getFavList(int userId);


  


  @Modifying
@Transactional
   @Query("delete from Favorite as fav where fav.advertid=:advertid and fav.userid=:userid")
   void deleteFavAdvertAdvertidAndUserid(int advertid,int userid);
} 

