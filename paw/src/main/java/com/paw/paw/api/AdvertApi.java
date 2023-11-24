package com.paw.paw.api;

import com.paw.paw.business.abstracts.AdvertService;
import com.paw.paw.core.DataResult;
import com.paw.paw.entities.dtos.AdvertDetailDto;
import com.paw.paw.entities.dtos.AdvertForAdvertListDto;
import jakarta.servlet.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/getAdvertFilterByCategory")
    public DataResult<List<AdvertForAdvertListDto>>  getAdvertFilterByCategory(@RequestParam("categoryId") int categoryId) {
        return  this.advertService.getAdvertFilterByCategory(categoryId);
    }

    @GetMapping("/getAdvertDetail")
   public DataResult<AdvertDetailDto> getAdvertDetail(@RequestParam("id") int id){
        return  this.advertService.getAdvertDetail(id);
    }
    @GetMapping("/getAdvertFilterBySearchText")
     public DataResult<List<AdvertForAdvertListDto>> getAdvertFilterBySearchText(@RequestParam("searchText") String searchText){
        return this.advertService.getAdvertFilterBySearchText(searchText);
     }
}


