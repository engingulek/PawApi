package com.paw.paw.api;

import com.paw.paw.business.abstracts.AdvertService;
import com.paw.paw.core.DataResult;
import com.paw.paw.entities.dtos.AdvertForAdvertListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/adverts")
public class AdvertApi {

    private AdvertService advertService;

    @Autowired
    public  AdvertApi(AdvertService advertService) {
        this.advertService = advertService;
    }

    @GetMapping("/getAdverts")
    public DataResult<List<AdvertForAdvertListDto>> getAdverts(){
        return  this.advertService.getAdvertList();
    }
}


