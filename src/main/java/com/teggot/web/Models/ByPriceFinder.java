package com.teggot.web.Models;

import java.util.List;

public class ByPriceFinder {

    private final List<Product> mList;

    public ByPriceFinder(List<Product> _mList) {
        this.mList = _mList;
    }

    public List<Product> getmList() {return mList;}

}
