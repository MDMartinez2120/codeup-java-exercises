import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);


//      object array of people = can add as many people to this object
//      reason this works is the constructor in person class is making a new person kind of like a pre-built list.
        Person[] people = {
                new Person("John"),
                new Person("Matt"),
                new Person("Larry")
        };
        //person array is the method below that is looping through the object and displaying the name on the console.
        PersonArray(people);
        Person[] newArray = addPerson(people, new Person("Tony"));
        PersonArray(newArray);

    }
    //takes a person loops through object array and outputs the people.
    public static void PersonArray(Person[] people){
        for (int i = 0; i < people.length; i++){
            System.out.println(people[i].getName());
        }
    }
// This add a new person to the array. it uses parts from earlier code to copy the array and add a new item.

    public static Person[] addPerson(Person[] people, Person newPerson){
        Person[] returnPerson = Arrays.copyOf(people, people.length + 1);
        returnPerson[people.length] = newPerson;
        return returnPerson;
    }

}


