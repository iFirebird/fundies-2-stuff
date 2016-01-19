// Assignment 1
// parmar aditya
// parmarad
// moomaw phoenix
// pmoomaw

// represents a habitation
interface IHabitation { }

// represents a planet
class Planet implements IHabitation {
    String name;
    int population; //in thousands of people
    int spaceports;
    
    Planet(String name, int population, int spaceports) {
        this.name = name;
        this.population = population;
        this.spaceports = spaceports;
    }
}

// represents a space station
class SpaceStation implements IHabitation {
    String name;
    int population;
    int transporterPads;
    
    SpaceStation(String name, int population, int transporterPads) {
        this.name = name;
        this.population = population;
        this.transporterPads = transporterPads;
    }
}

// represents a transportation mode
interface ITransportation { }

// represents a transporter
class Transporter implements ITransportation {
    IHabitation from;
    IHabitation to;
    
    
    
}

// represents a shuttle
class Shuttle implements ITransportation {
    IHabitation from;
    IHabitation to;
    int fuel; // to the nearest kilogram
    int capacity;
    
}

// represents a space elevator
class SpaceElevator implements ITransportation {
    IHabitation from;
    IHabitation to;
    
}

// represents examples of habitations
class ExamplesHabitation {
    IHabitation nausicant = new Planet("Nausicant", 6000000, 8);
    IHabitation earth = new Planet("Earth", 9000000, 14);
    IHabitation remus = new Planet("Remus", 18000000, 23);
    IHabitation watcherGrid = new SpaceStation("WatcherGrid", 1000, 0);
    IHabitation deepSpace42 = new SpaceStation("Deep Space 42", 7000, 8);
}