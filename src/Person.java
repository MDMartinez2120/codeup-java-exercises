import java.util.ArrayList;

public class Person {
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    private String name;
//
    public Person(String name) {
        this.name = name;
    }

    //TODO: return the person's name
    public String getName(){
        return name;
    }

    //TODO: change the name field to the passed value
    public void setName(String name){
        this.name = name;
    }

    //TODO: print a message to the console using the person's name
    public void sayHello(){
        String.format("%s says hello!", this.name);
    }




}



