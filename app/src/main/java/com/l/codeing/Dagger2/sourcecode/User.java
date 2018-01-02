package com.l.codeing.Dagger2.sourcecode;

import android.util.Log;


/**
 * Description: User
 * Creator: Cr.L
 * Date: 2017/12/28
 */

public class User {

    public Weapon weapon;

    public User(){
        DaggerUserComponent.create().inject(this);
    }

    public void show(){
        Log.d("show","user挥舞着" + weapon.getName());
    }

}
