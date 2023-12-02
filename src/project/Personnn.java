package project;

/**
 * @author : sultan , medo
 * @writen: dec , 1, 2023
 * @course: itec 2140
 * @section: 09 fall
 * @description: this code creates a person and takes two objects name , age
 * @quistion: Write a person program that takes 2 objects
 *
 * 1- string name
 *
 * 2- int age
 */
public class Personnn {
    private String name;
    private int age;

    public Personnn(String name, int age) {
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
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personnn{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
class personTester{
    public static void main(String[] args) {
        Personnn myPerson = new Personnn("medo" , 21);
        System.out.println(myPerson);
    }
}
