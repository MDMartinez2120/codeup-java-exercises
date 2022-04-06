import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class collectionsLecture {
    public static void main(String[] args) {
//        ArrayList<Person> peeps = new ArrayList<>();
//
//        Person person1 = new Person("Tim");
//        Person person2 = new Person("Al");
//        Person person3 = new Person("Jill");
//        peeps.add(person1);
//        peeps.add(person2);
//        peeps.add(person3);
//        for (Person person : peeps){
//            System.out.println(person.getName());
//        }

        HashMap<String, Integer> careerWins = new HashMap<>();

        //the String in this case is the Key,
        careerWins.put("Gregg Popovich", 1341);
        careerWins.put("Don Nelson", 1355);
        careerWins.put("Lenny Wilkens", 1332);

        //When you call the key you will get the Value at that Key.
        System.out.println(careerWins.get("Gregg Popovich"));
        System.out.println(careerWins);

        //hash map does not print out in a specific order so if you want to
        //add things in a certain order use an ArrayList instead.

        //this is how you loop through a hashmap
        //careerWinsSet is just like a variable name for the loop.
        for (Map.Entry<String, Integer> careerWinsSet : careerWins.entrySet()){
            System.out.println(careerWinsSet.getKey() + " : " + careerWinsSet.getValue());
        }

        //using keySet method to output all the coach names because they are keys. you
        //have to use an enhanced loop to output all the keys AKA coach names in this case.

        Set<String> coachNames = careerWins.keySet();
        for (String coachName : coachNames){
            System.out.println(coachName);
        }


    }
}
