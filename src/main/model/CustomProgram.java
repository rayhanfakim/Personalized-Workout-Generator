package main.model;

import java.util.Objects;

public class CustomProgram {
    User user;

    public CustomProgram(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomProgram that = (CustomProgram) o;
        return Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {

        return Objects.hash(user);
    }
}
