public class Hangar {

    public static void main(String[] args) {
        Car clio = new Car("Clio", 100);
        Boat queenMary = new Boat("Queen Mary", 50000);
        System.out.println(clio.doStuff());
        System.out.println(queenMary.doStuff());
    }
}