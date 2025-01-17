class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        person.display();

        person.setName("Bob");
        person.setAge(35);

        person.display();

        person.setAge(-5);

        person.display();
    }
}
