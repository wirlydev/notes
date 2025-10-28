package inheritanceStuff;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pet bellita = new Dog();
        bellita.setName("Bellita");
        bellita.setAge(5);

        Pet snuffy = new Cat();
        snuffy.setName("Snuffy");
        snuffy.setAge(6);
        
        ArrayList<Pet> pets = new ArrayList<Pet>();

        pets.add(bellita);
        pets.add(snuffy);

        for (int i = 0; i < pets.size(); i++) {
            Pet p = pets.get(i);
            p.speak();
        }

        int i = 0;
        while (i < pets.size()) {
            System.out.println("I love " + pets.get(i).getName());
            i++;
        }

        for (Pet p : pets) {
            System.out.println(p.getName() + " is " + p.getAge());
        }
    }
}
