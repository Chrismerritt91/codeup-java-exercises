public class dishTest {
    public static void main(String[] args) {
//        Dish dish = new Dish(); can use this instead of putting an empty constructor in the other file

         Dish dish1 = new Dish(1500, "cake", true);
         Dish dish2 = new Dish(2300, "Filet Mignon", true);
         Dish dish3 = new Dish(2000, "Pan-seared Salmon", false);

         // you can establish values here instead of using the constructors
//         dish1.nameOfDish = "cake";
//         dish1.costInCents = 1500;
//         dish1.wouldRecommend = true;

        dish1.printSummary();
        dish2.printSummary();
        dish3.printSummary();
    }
}
