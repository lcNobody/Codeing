package com.l.codeing.Dagger2.sourcecode;

import javax.inject.Inject;

/**
 * Description: Weapon
 * Creator: Cr.L
 * Date: 2017/12/28
 */

public class Weapon {
    public String name;

    public Weapon(){
        this.name = "大刀";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
