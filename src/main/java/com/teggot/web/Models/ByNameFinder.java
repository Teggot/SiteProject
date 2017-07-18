package com.teggot.web.Models;


import java.util.List;

public class ByNameFinder {


    private final List<Product> mList;

    public ByNameFinder(List<Product> _mList) {
        this.mList = _mList;
    }

    public List<Product> getMList() {return mList;}


}
