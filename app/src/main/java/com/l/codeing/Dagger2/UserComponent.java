package com.l.codeing.Dagger2;

import dagger.Component;

/**
 * Description: ActivityComponent
 * Creator: Cr.L
 * Date: 2017/12/28
 */
@Component
public interface UserComponent {
    void inject(User<XiaoDao> user);
}
