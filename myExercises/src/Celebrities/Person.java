package Celebrities;

import java.util.ArrayList;

class Person {
    private final String name;
    private final ArrayList<Person> IKnow = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIKnow(Person person) {
        IKnow.add(person);
    }

    public boolean knows(Person person) {
        return IKnow.contains(person);
    }
}
