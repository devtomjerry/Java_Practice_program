class Animals {
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Mammal extends Animals {
    public void walk() {
        System.out.println("Mammal walks");
    }
}

class Dogs extends Mammal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dogs dogs = new Dogs();
        dogs.eat();
        dogs.walk();
        dogs.bark();
    }
}
