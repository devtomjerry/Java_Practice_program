class Animl {
    public void eat() {
        System.out.println("Animal");
    }
}

class Cat extends Animl {
    public void bark() {
        System.out.println("cat");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.bark();
    }
}
