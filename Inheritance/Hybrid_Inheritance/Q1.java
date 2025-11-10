/*Sample Problem 1: Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects. */



interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Person: " + name + ", ID: " + id);
    }
}

class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " cooks " + specialty);
    }

    @Override
    public void display() {
        System.out.println("Chef: " + name + ", ID: " + id + ", Specialty: " + specialty);
    }
}

class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " serves " + tablesAssigned + " tables");
    }

    @Override
    public void display() {
        System.out.println("Waiter: " + name + ", ID: " + id + ", Tables: " + tablesAssigned);
    }
}

public class Q1{
    public static void main(String[] args) {
        Worker w1 = new Chef("Arjun", 101, "Italian");
        Worker w2 = new Waiter("Meera", 202, 6);

        w1.performDuties();
        w2.performDuties();

        Person[] staff = {
            new Chef("Kabir", 103, "Pastry"),
            new Waiter("Pooja", 204, 4)
        };

        for (Person p : staff) {
            p.display();
            ((Worker) p).performDuties();
        }
    }
}
