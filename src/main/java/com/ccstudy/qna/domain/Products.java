package com.ccstudy.qna.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Products {
    int idx;
    String name;
    String price;
    String image_url;
    int product_category_index;
    int brand_idx;
    String link;
    Object measure;
    Date date;
    int like_score;
}
