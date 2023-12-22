package com.paw.paw.business.abstracts;

import com.paw.paw.core.DataResult;
import com.paw.paw.core.Result;
import com.paw.paw.core.SuccessResult;
import com.paw.paw.entities.concretes.Advert;
import com.paw.paw.entities.dtos.AdvertDetailDto;
import com.paw.paw.entities.dtos.AdvertForAdvertListDto;

import java.util.List;

public interface AdvertService {
    DataResult<List<AdvertForAdvertListDto>> getAdvertList();
    DataResult<List<AdvertForAdvertListDto>> getAdvertFilterByCategory(int categoryId);

    DataResult<AdvertDetailDto> getAdvertDetail(int advertId,int userId);
    DataResult<List<AdvertForAdvertListDto>> getAdvertFilterBySearchText(String searchText);
    DataResult<List<AdvertForAdvertListDto>> getAdvertFilterByCategoryAndSearchText(int categoryId,String searchText);
    Result addAdvertToAdvertList(Advert advert);
    DataResult<List<AdvertForAdvertListDto>> getAdvertListByUserId(int userId);
    Result deleteAdvertFromAdvert(int id,int userid);

}
