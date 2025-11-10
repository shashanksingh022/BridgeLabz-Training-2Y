/*Create a Person class with a copy constructor that clones another person's attributes.
 */

 class Address {
    String street;
    String city;
    String zip;

    Address() {
        this("", "", "");
    }

    Address(String street, String city, String zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    Address(Address other) {
        this(other.street, other.city, other.zip);
    }

    String full() {
        return street + ", " + city + " - " + zip;
    }
}

class Person {
    String name;
    int age;
    Address address;

    Person() {
        this("Unknown", 0, new Address());
    }

    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    Person(Person other) {
        this(other.name, other.age, new Address(other.address));
    }

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Address: " + address.full());
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Address a1 = new Address("MG Road", "Bengaluru", "560001");
        Person p1 = new Person("Amit", 25, a1);

        Person p2 = new Person(p1);

        p1.display();
        p2.display();

        p2.name = "Rohit";
        p2.address.street = "Brigade Road";

        System.out.println("After modifying clone:");
        p1.display();
        p2.display();
    }
}
