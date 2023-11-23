package com.paw.paw.business.abstracts;

import com.paw.paw.core.DataResult;
import com.paw.paw.entities.dtos.AdvertDetailDto;
import com.paw.paw.entities.dtos.AdvertForAdvertListDto;

import java.util.List;

public interface AdvertService {
    DataResult<List<AdvertForAdvertListDto>> getAdvertList();
    DataResult<List<AdvertForAdvertListDto>> getAdvertFilterByCategory(int categoryId);

    public DataResult<AdvertDetailDto> getAdvertDetail(int id);
}
