package com.teggot.web.Models;

import java.util.List;

public class ByLengthFinder {

    private final List<Product> mList;

    public ByLengthFinder(List<Product> _mList) {
        this.mList = _mList;
    }

    public List<Product> getmList() {return mList;}

}
