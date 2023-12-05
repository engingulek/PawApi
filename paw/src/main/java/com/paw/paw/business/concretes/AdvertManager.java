package com.paw.paw.business.concretes;

import com.paw.paw.business.abstracts.AdvertService;
import com.paw.paw.core.DataResult;
import com.paw.paw.core.SuccessDataResult;
import com.paw.paw.dataAccess.AdvertDao;
import com.paw.paw.entities.dtos.AdvertDetailDto;
import com.paw.paw.entities.dtos.AdvertForAdvertListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertManager implements AdvertService {

    private AdvertDao advertDao;

    @Autowired
    public  AdvertManager(AdvertDao advertDao){
        super();
        this.advertDao = advertDao;
    }

    @Override
    public DataResult<List<AdvertForAdvertListDto>> getAdvertList() {
        return new  SuccessDataResult<List<AdvertForAdvertListDto>>(this.advertDao.getAdvertList(),"Data Listed");
    }

    public DataResult<List<AdvertForAdvertListDto>> getAdvertFilterByCategory(int categoryId){
        return new SuccessDataResult<List<AdvertForAdvertListDto>>(this.advertDao.getAdvertFilterByCategory(categoryId),"Data Listed");
    }

    public DataResult<AdvertDetailDto> getAdvertDetail(int advertId,int userId){
        return  new SuccessDataResult<AdvertDetailDto>(this.advertDao.getAdvertDetail(advertId,userId),"Data Listed");
    }

    public DataResult<List<AdvertForAdvertListDto>> getAdvertFilterBySearchText(String searchText){
       return new SuccessDataResult<List<AdvertForAdvertListDto>>(this.advertDao.getAdvertFilterBySearchText(searchText),"Data Listed");
    }

    public DataResult<List<AdvertForAdvertListDto>> getAdvertFilterByCategoryAndSearchText(int categoryId,String searchText){
        return new SuccessDataResult<List<AdvertForAdvertListDto>>(this.advertDao.getAdvertFilterByCategoryAndSearchText(categoryId, searchText),"Data Listed");
    }
}
