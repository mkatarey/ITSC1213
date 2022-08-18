public class Driver {
    public static void main(String [] args) {
        /*
          Food is a class that uses a Sized interface
          Sized should return a double from its getSize method
         */
        Food apple, grains;
        //Food has a name and size and overrides the toString method
        apple = new Food("Apple", 2.1);
        grains = new Food("Wheat", .4);
        /*
          Animal is an abstract class that extends Food
          with a non implemented eats method
         */
        Animal frank, chad, mosely, sally;
        /*
          Mouse is child class of Animal
          when it eats it increases its size by 80% of its food
          A mouse cannot eat animals
         */
        frank = new Mouse("Frank", 20);
        mosely = new Mouse("Mosely", 17);
        /*
          Snake is child class of Animal
          when it eats it increases its size by its food
          A snake can only eat animals
         */
        chad = new Snake("Chad", 243);
        sally = new Snake("Sally", 59);

        double frankSizeStart = frank.getSize(),
               moselySizeStart = mosely.getSize(),
               sallySizeStart = sally.getSize(),
               chadSizeStart = chad.getSize();

        System.out.println(apple);
        System.out.println(grains);
        System.out.println(frank);
        System.out.println(mosely);
        System.out.println(chad);
        System.out.println(sally);

        frank.eats(apple);
        mosely.eats(frank);
        sally.eats(grains);
        chad.eats(mosely);

        double frankSizeEnd = frank.getSize(),
                moselySizeEnd = mosely.getSize(),
                sallySizeEnd = sally.getSize(),
                chadSizeEnd = chad.getSize();

        System.out.println(frank);
        System.out.println(mosely);
        System.out.println(chad);
        System.out.println(sally);

        System.out.println("Frank's size has changed: " + (frankSizeStart == frankSizeEnd));
        System.out.println("Mosley's size has not changed: " + (moselySizeStart == moselySizeEnd));
        System.out.println("Sally's size has not changed: " + (sallySizeStart == sallySizeEnd));
        System.out.println("Chad's size has not changed: " + (chadSizeStart == chadSizeEnd));

    }
}