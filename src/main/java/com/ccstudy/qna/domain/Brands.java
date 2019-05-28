package com.ccstudy.qna.domain;


public class Brands {
    private int idx;
    private String name_korean;
    private String name_english;
    private String link;
    private String style2;

    public Brands() {
    }

    public Brands(int idx, String name_korean, String name_english, String link, String style2) {
        this.idx = idx;
        this.name_korean = name_korean;
        this.name_english = name_english;
        this.link = link;
        this.style2 = style2;
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

    public String getLink() {
        return link;
    }

    public String getStyle2() {
        return style2;
    }
}
