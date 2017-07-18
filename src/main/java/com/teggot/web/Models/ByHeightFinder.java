package com.teggot.web.Models;

import java.util.List;

public class ByHeightFinder {

    private final List<Product> mList;

    public ByHeightFinder(List<Product> _mList) {
        this.mList = _mList;
    }

    public List<Product> getmList() {return mList;}

}
