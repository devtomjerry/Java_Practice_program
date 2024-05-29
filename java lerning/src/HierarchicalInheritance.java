class Animalss {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Cow extends Animalss {
    void bark() {
        System.out.println("Cow");
    }
}

class Bird extends Animalss {
    void meow() {
        System.out.println("Bird");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.eat();
        cow.bark();

        Bird bird = new Bird();
        bird.eat();
        bird.meow();
    }
}
