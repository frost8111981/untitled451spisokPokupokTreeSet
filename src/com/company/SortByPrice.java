package com.company;

import java.util.Comparator;

public class SortByPrice implements Comparator<Wish> {
    private Sort sort;

    public SortByPrice(Sort sort) {
        this.sort = sort;
    }

    @Override
    public int compare(Wish o1, Wish o2) {
        if (sort == Sort.MAX) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        } else {
            return Double.compare(o2.getPrice(), o1.getPrice());
        }
    }
}
