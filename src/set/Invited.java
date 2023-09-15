package set;

import java.util.Objects;

public class Invited {

    private String name;
    private int code;

    public Invited(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Invited{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Invited invited)) return false;
        return getCode() == invited.getCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
