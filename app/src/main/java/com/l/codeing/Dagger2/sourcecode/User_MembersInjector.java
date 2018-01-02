// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.l.codeing.Dagger2.sourcecode;

import javax.inject.Provider;

import dagger.MembersInjector;

public final class User_MembersInjector implements MembersInjector<User> {
  private final Provider<Weapon> weaponProvider;

  public User_MembersInjector(Provider<Weapon> weaponProvider) {
    assert weaponProvider != null;
    this.weaponProvider = weaponProvider;
  }

  public static MembersInjector<User> create(Provider<Weapon> weaponProvider) {
    return new User_MembersInjector(weaponProvider);
  }

  @Override
  public void injectMembers(User instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.weapon = weaponProvider.get();
  }
}