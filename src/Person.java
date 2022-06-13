public class Person {
    private String name;

    public Person () {}

    public Person(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("steve");
        person1.sayHello();



    }
}


