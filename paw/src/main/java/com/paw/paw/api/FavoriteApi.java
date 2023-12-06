package com.paw.paw.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paw.paw.business.abstracts.FavoriteService;
import com.paw.paw.core.DataResult;
import com.paw.paw.core.Result;
import com.paw.paw.entities.concretes.Favorite;
import com.paw.paw.entities.dtos.FavoriteForFavListDto;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.validation.annotation.Validated;


@RestController
@RequestMapping("api/favorites")
public class FavoriteApi {
  private FavoriteService favoriteService;

  @Autowired
  public FavoriteApi(FavoriteService favoriteService){
     this.favoriteService = favoriteService;
  }

  @GetMapping("/getFavorites")
  public DataResult<List<FavoriteForFavListDto>> getFavorites(@RequestParam("userid") int userid){
          return this.favoriteService.getFavList(userid);
  }

  @DeleteMapping("/deleteFavAdvert")
  public Result deleteFavAdvert(@RequestParam("id") int id){
    return this.favoriteService.deleteFavAdvertFromFavList(id);
  }

  @DeleteMapping("/deleteFavAdvertByAdvertIdAndUserId")
  public Result  deleteFavAdvertByAdvertIdAndUserId(@RequestParam("advertid") int advertid,@RequestParam("userid") int userid){
    return this.favoriteService.deleteFavAdvertByAdvertidAndUserid(advertid, userid);
  }

  @PostMapping("/add")
  public Result addAdvertToFavList(@RequestBody @Validated Favorite favorite){
    return this.favoriteService.addAdvertToFavList(favorite);
  }
}
