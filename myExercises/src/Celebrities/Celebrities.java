package Celebrities;

import java.util.ArrayList;

/**
 * https://youtu.be/xGvQN_g-JCI
 */
public class Celebrities {
    public static void main(String[] args) {
        Person person1 = new Person("Arman");
        Person person2 = new Person("Bake");
        Person person3 = new Person("Dake");
        Person person4 = new Person("Almat");
        Person person5 = new Person("Dauren");

        person1.setIKnow(person3);
        person2.setIKnow(person3);
        person4.setIKnow(person3);
        person5.setIKnow(person3);

        Person[] people = {
            person1,
            person2,
            person3,
            person4,
            person5,
        };

        System.out.println(findCelebrity(people).getName());
    }

    public static Person findCelebrity(Person[] people) {
        int l = 0;
        int r = people.length - 1;

        while (l < r) {
            if (people[l].knows(people[r])) {
                l++;
            } else {
                r--;
            }
        }

        for (int i = 0; i < people.length; i++) {
            if (i == r) {
                continue;
            }

            if (people[r].knows(people[i])) {
                return null;
            }
        }

        return people[r];
    }
}

