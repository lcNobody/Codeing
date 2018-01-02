package com.l.codeing.Dagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Description: User
 * Creator: Cr.L
 * Date: 2017/12/28
 */

public class User<T extends Weapon> {
    @Inject
    public T weapon;

    public User(){

    }

    public void show(){
        Log.d("show","user挥舞着" + weapon.getName());
    }

}
