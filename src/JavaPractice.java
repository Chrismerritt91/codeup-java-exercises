public class JavaPractice {
    public static void main(String[] args) {

        System.out.println(sayName("Chris"));
        System.out.println(sayName("Chris", "Merritt"));
        System.out.println(add(3.4, 4.2));
    }

    public static String sayName(String name){
        return "hello " + name;
    }

    public static String sayName(String name, String name2){
        return "hello " + name + " " + name2;
    }

    public static double add(double num1, double num2){
        return num1 + num2;
    }
}
