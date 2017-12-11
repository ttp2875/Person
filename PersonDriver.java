package person;
import person.*;

public class PersonDriver {
public static void main(String[] args) {
    Person tai = new Person();
    System.out.println(tai);
    tai.setName("Tai");
    tai.setAge(21);
    System.out.println(tai.getName());
    System.out.println(tai.getAge());

    Person lina = new Person("Lina", 18);

    if(tai.getName().equals(lina.getName()) && tai.getAge() == lina.getAge()) {
        System.out.println("Two peron name and age are equal.");

    } else {
        System.out.println("Two persons name and age are not equal.");
    }
}
}
