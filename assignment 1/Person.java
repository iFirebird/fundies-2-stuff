// Assignment 1
// parmar aditya
// parmarad
// moomaw phoenix
// pmoomaw

// represents a person
class Person {
    String name;
    int yob;
    String state;
    boolean citizen;

    Person(String name, int yob, String state, boolean citizen) {
        this.name = name;
        this.yob = yob;
        this.state = state;
        this.citizen = citizen;

    }

}

// represents examples of person
class ExamplesPerson {

    Person jackie = new Person("Jackie Robinson", 1920, "NY", true);
    Person golda = new Person("Golda Meir", 1930, "MA", false);
    Person bob = new Person("Bob Bobs", 2000, "NH", true);

}