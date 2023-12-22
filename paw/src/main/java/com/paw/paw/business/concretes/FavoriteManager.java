package com.paw.paw.business.concretes;

import com.paw.paw.business.abstracts.FavoriteService;
import com.paw.paw.dataAccess.FavoriteDao;
import com.paw.paw.entities.concretes.Favorite;
import com.paw.paw.entities.dtos.FavoriteForFavListDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paw.paw.core.DataResult;
import com.paw.paw.core.Result;
import com.paw.paw.core.SuccessDataResult;
import com.paw.paw.core.SuccessResult;

import java.util.List;

@Service
public class FavoriteManager implements FavoriteService  {
      private FavoriteDao favoriteDao;
      
      @Autowired
      public FavoriteManager(FavoriteDao favoriteDao){
          super();
          this.favoriteDao = favoriteDao;
      }

      @Override
      public DataResult<List<FavoriteForFavListDto>> getFavList(int userId){
          return new SuccessDataResult<List<FavoriteForFavListDto>>(this.favoriteDao.getFavList(userId),"Data Listed");
      }

    @Override
    public Result deleteFavAdvertFromFavList(int id) {
         this.favoriteDao.deleteById(id);
        return new Result(true, "Data Deleted");
    }
    @Override
    public Result deleteFavAdvertByAdvertidAndUserid(int advertId, int userid) {
        this.favoriteDao.deleteFavAdvertAdvertidAndUserid(advertId, userid);
       // this.favoriteDao.deleteFavAdvertFromFavList(advertId, userid);
         return new Result(true, "Data Deleted");
    }

    @Override
    public Result addAdvertToFavList(Favorite favorite) {
        this.favoriteDao.save(favorite);
        return new Result(true, "Add");
    }


          
}

