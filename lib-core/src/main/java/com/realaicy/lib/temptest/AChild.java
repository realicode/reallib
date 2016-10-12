package com.realaicy.lib.temptest;

/**
 * Created by realaicy on 2016/10/11.
 */
public class AChild extends AParent implements Deletable {
    private String deleteFlg;

    @Override
    public void markDelete() {
        this.deleteFlg = "1";
    }
}
