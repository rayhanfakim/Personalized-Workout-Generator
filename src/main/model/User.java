package main.model;

import java.util.Objects;

public class User {
    String name;
    private CustomProgram program;

    public User(String name, CustomProgram program) {
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomProgram getProgram() {
        return program;
    }

    public void setProgram(CustomProgram program) {
        this.program = program;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(program, user.program);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, program);
    }
}
