package com.realaicy.lib.temptest;

import com.realaicy.lib.core.utils.Reflections;

/**
 * Created by realaicy on 2016/10/11.
 */
public class Service {

    public void saveParent(AParent aParent) {

        System.out.println("parent");

        System.out.println(Reflections.getUserClass(aParent));
    }

    public void saveDeletable(Deletable deletable) {
        System.out.println("deletable");

    }
}
