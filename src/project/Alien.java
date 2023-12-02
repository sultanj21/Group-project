package project;

/**
 * @author : medo , sultan
 * @course: itec 2140
 * @writen: 1 , dec , 2023
 * @section: 09 fall
 * @description: this code checks if the spices is an aline by checking two objects planet, numberOfEyes.
 * @quistion:ou’re categorizing a new species of alien found by the military, use the following instance variables to create the constructor getters and setters:
 *
 * Boolean( planet)
 *
 * Int eyes:
 * Create an equal method isAlien
 */
public class Alien {
    private String planet;
    private int numberOfEyes;

    public Alien(String planet, int numberOfEyes) {
        this.planet = planet;
        this.numberOfEyes = numberOfEyes;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "planet='" + planet + '\'' +
                ", numberOfEyes=" + numberOfEyes +
                '}';
    }
}
 class alienTester{
    public static boolean isAlien(Alien theAlien){
        int eyes = theAlien.getNumberOfEyes();
        String planet =theAlien.getPlanet();
        boolean isAlien = true;
        if((eyes == 2) && (planet.equalsIgnoreCase("earth"))){
            isAlien = false;
        }
        return isAlien;


    }

    public static void main(String[] args) {
        Alien myAlien = new Alien("earth" , 20);
        System.out.println(myAlien);
        boolean isAlienn = isAlien(myAlien);
        System.out.println(isAlienn);

    }
}

