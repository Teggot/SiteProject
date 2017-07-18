package com.teggot.web.Models;

import java.util.List;

public class ByWidthFinder {

    private final List<Product> mList;

    public ByWidthFinder(List<Product> _mList) {
        this.mList =_mList;
    }

    public List<Product> getmList() {return mList;}
}
