package com.paw.paw.business.abstracts;

import com.paw.paw.core.DataResult;
import com.paw.paw.core.Result;
import com.paw.paw.core.SuccessResult;
import com.paw.paw.entities.dtos.FavoriteForFavListDto;
import java.util.List;
public interface FavoriteService {
          
 DataResult<List<FavoriteForFavListDto>> getFavList(int userId);
 Result deleteFavAdvertFromFavList(int id);
 Result deleteFavAdvertByAdvertidAndUserid(int advertId,int userid);

          
} 