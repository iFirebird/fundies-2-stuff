// Assignment 1
// parmar aditya
// parmarad
// moomaw phoenix
// pmoomaw

/* A Taco is one of
 * -- EmptyShell
 * -- Filled
 */
// represents a taco
interface ITaco { }

// represents an empty taco
class EmptyShell implements ITaco {
    boolean softShell;
    
    EmptyShell(boolean softShell) {
        this.softShell = softShell;
    }
}

// represents a filled taco
class Filled implements ITaco {
    ITaco taco;
    String filling;
    
    Filled(ITaco taco, String filling) {
        this.taco = taco;
        this.filling = filling;
    }
}

class ExamplesTaco implements ITaco {
    
    ITaco shell1 = new EmptyShell(true);
    ITaco filling1 = new Filled(shell1, "carnitas");
    ITaco filling2 = new Filled(filling1, "salsa");
    ITaco filling3 = new Filled(filling2, "lettuce");
    ITaco order1 = new Filled(filling3, "cheddar cheese");
    
    ITaco shell2 = new EmptyShell(false);
    ITaco filling4 = new Filled(shell2, "veggies");
    ITaco filling5 = new Filled(filling4, "guacamole");
    ITaco order2 = new Filled(filling5, "sour cream");
    
}
