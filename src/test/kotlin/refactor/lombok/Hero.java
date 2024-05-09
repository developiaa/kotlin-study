package refactor.lombok;

import java.util.Objects;

public class Hero {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hero hero)) return false;
        return age == hero.age && Objects.equals(name, hero.name) && Objects.equals(address, hero.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("아이언맨");
        hero.setAge(22);
        hero.setAddress("text");
    }


}
