// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.l.codeing.Dagger2.sourcecode;

import dagger.MembersInjector;

public final class DaggerUserComponent implements UserComponent {
  private MembersInjector<User> userMembersInjector;

  private DaggerUserComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static UserComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.userMembersInjector = User_MembersInjector.create(Weapon_Factory.create());
  }

  @Override
  public void inject(User user) {
    userMembersInjector.injectMembers(user);
  }

  public static final class Builder {
    private Builder() {}

    public UserComponent build() {
      return new DaggerUserComponent(this);
    }
  }
}
