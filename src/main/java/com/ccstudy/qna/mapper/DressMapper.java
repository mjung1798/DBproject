package com.ccstudy.qna.mapper;

import com.ccstudy.qna.domain.Brands;
import com.ccstudy.qna.domain.Products;
import com.ccstudy.qna.dto.BrandProductDto;
import com.ccstudy.qna.dto.LikeProductDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DressMapper {

    @Select("select * from brand")
    List<Brands> findAllBrands();

    @Select("SELECT p.*, b.name_korean, b.name_english FROM befit.product AS p " +
            "JOIN befit.brand AS b ON brand_idx = #{b_idx} AND b.idx = #{b_idx}")
    List<BrandProductDto> findByBrandProduct(@Param("b_idx") final int b_idx);

    @Select("SELECT * FROM befit.like_product " +
            "JOIN befit.product AS p ON p.pidx = like_product.lidx " +
            "JOIN befit.brand AS b ON b.idx = p.brand_idx ORDER BY brand_idx")
    List<LikeProductDto> findByLikeProduct();

    @Insert("INSERT INTO like_product(product_idx) VALUES(#{p_idx})")
    @Options(useGeneratedKeys = true, keyColumn = "like_product.lidx")
    void saveLike(@Param("p_idx") final int p_idx);

}
