package com.paw.paw.business.abstracts;

import com.paw.paw.core.DataResult;
import com.paw.paw.entities.dtos.AdvertForAdvertListDto;

import java.util.List;

public interface AdvertService {
    DataResult<List<AdvertForAdvertListDto>> getAdvertList();
}
