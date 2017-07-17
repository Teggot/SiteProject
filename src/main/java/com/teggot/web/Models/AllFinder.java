package com.teggot.web.Models;

import java.util.List;

public class AllFinder {

    private final List<Product> mList;

    public AllFinder(List<Product> _mList) {this.mList = _mList;}

    public List<Product> getMList() {return mList;}

}
