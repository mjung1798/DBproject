package com.ccstudy.qna.dto;

public class LikeProductDto {
    private int lidx;
    private int product_idx;
    private int pidx;
    private String name;
    private String price;
    private String image_url;
    private int brand_idx;
    private String prod_link;
    private String measure;
    private int idx;
    private String name_korean;
    private String name_english;
    private String style2;
    private String link;

    public LikeProductDto(int lidx, int product_idx, int pidx, String name, String price, String image_url, int brand_idx, String prod_link, String measure, int idx, String name_korean, String name_english, String style2, String link) {
        this.lidx = lidx;
        this.product_idx = product_idx;
        this.pidx = pidx;
        this.name = name;
        this.price = price;
        this.image_url = image_url;
        this.brand_idx = brand_idx;
        this.prod_link = prod_link;
        this.measure = measure;
        this.idx = idx;
        this.name_korean = name_korean;
        this.name_english = name_english;
        this.style2 = style2;
        this.link = link;
    }

    public int getLidx() {
        return lidx;
    }

    public int getProduct_idx() {
        return product_idx;
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

    public int getIdx() {
        return idx;
    }

    public String getName_korean() {
        return name_korean;
    }

    public String getName_english() {
        return name_english;
    }

    public String getStyle2() {
        return style2;
    }

    public String getLink() {
        return link;
    }
}
