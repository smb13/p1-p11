package com.myexample.p11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static List<People> generatePeople () {
        List<People> people = new ArrayList<>();
        people.add(new People("William", "Sword", 1200));
        people.add(new People("Teodor", "Foxter", 2100));
        people.add(new People("Vanessa", "Bakster", 1300));
        people.add(new People("Tina", "Clooney", 1600));
        return people;
    }

    public static List<People> sortPeople (List<People> people, int minSalary, int maxSalary) {
        return people.stream()
                .filter(x -> x.getSalary() >= minSalary && x.getSalary() <= maxSalary)
                .sorted(Comparator.comparing(People::getSecondName))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(sortPeople(generatePeople(), 1300, 2200));
    }
}
