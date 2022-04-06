import java.util.ArrayList;

public class collectionsLecture {
    public static void main(String[] args) {
        ArrayList<Person> peeps = new ArrayList<>();

        Person person1 = new Person("Tim");
        Person person2 = new Person("Al");
        Person person3 = new Person("Jill");
        peeps.add(person1);
        peeps.add(person2);
        peeps.add(person3);
        for (Person person : peeps){
            System.out.println(person.getName());
        }
    }
}
