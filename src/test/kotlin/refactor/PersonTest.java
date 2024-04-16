package refactor;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void test() {
        Person person = new Person();
        person.setAddress("aa");
        System.out.println(person.getAddress());
    }
}
