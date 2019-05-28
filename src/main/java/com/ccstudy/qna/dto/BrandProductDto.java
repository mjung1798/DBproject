package com.ccstudy.qna.dto;

public class BrandProductDto {
    private int pidx;
    private String name;
    private String price;
    private String image_url;
    private int brand_idx;
    private String prod_link;
    private String measure;
    private String name_korean;
    private String name_english;

    public BrandProductDto(int pidx, String name, String price, String image_url, int brand_idx, String prod_link, String measure, String name_korean, String name_english) {
        this.pidx = pidx;
        this.name = name;
        this.price = price;
        this.image_url = image_url;
        this.brand_idx = brand_idx;
        this.prod_link = prod_link;
        this.measure = measure;
        this.name_korean = name_korean;
        this.name_english = name_english;
    }

    public int getPidx() {
        return pidx;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getImage_url() {
        return image_url;
    }

    public int getBrand_idx() {
        return brand_idx;
    }

    public String getProd_link() {
        return prod_link;
    }

    public String getMeasure() {
        return measure;
    }

    public String getName_korean() {
        return name_korean;
    }

    public String getName_english() {
        return name_english;
    }
}
