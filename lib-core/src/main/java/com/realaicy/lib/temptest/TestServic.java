package com.realaicy.lib.temptest;

import java.io.Serializable;

/**
 * Created by realaicy on 2016/10/11.
 */
public class TestServic {


    public static void main(String[] args) {
        AChild aChild = new AChild();
        BChild bChild = new BChild();
        AParent aParent = new AChild();
        AParent bParent = new BChild();

        Service service = new Service();
        service.saveParent(aParent);
    }
}
