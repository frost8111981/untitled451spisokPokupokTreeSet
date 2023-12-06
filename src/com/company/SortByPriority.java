package com.company;

import java.util.Comparator;

public class SortByPriority implements Comparator<Wish> {
    private Sort sort;

    public SortByPriority(Sort sort) {
        this.sort = sort;
    }

    @Override
    public int compare(Wish o1, Wish o2) {
        if (sort == Sort.MIN) {
            return Integer.compare(o1.getPriory(), o2.getPriory());
        } else {
            return Integer.compare(o2.getPriory(), o1.getPriory());
        }
    }
}
