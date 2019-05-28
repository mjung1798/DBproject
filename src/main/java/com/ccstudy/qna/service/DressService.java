package com.ccstudy.qna.service;


import com.ccstudy.qna.domain.Brands;
import com.ccstudy.qna.dto.BrandProductDto;
import com.ccstudy.qna.dto.LikeProductDto;
import com.ccstudy.qna.mapper.DressMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Slf4j
public class DressService {

    private final DressMapper dressMapper;

    public DressService(DressMapper dressMapper) {
        this.dressMapper = dressMapper;
    }

    @Transactional(readOnly = true)
    public List<Brands> getAllBrandList() {
        return dressMapper.findAllBrands();
    }

    @Transactional(readOnly = true)
    public List<BrandProductDto> getAllBrandProductList(int idx) {
        return dressMapper.findByBrandProduct(idx);
    }

    @Transactional
    public void saveLike(int idx){
        dressMapper.saveLike(idx);
    }

    @Transactional(readOnly = true)
    public List<LikeProductDto> getAllLikeProductList() {
        return dressMapper.findByLikeProduct();
    }
}
