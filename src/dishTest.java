public class dishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();


         Dish dish2 = new Dish(2300, "Filet Mignon", true);
         Dish dish3 = new Dish(2000, "Pan-seared Salmon", false);

         // you can establish values here instead of using the constructors
         dish1.setNameOfDish("cake");
         dish1.setCostInCents(1500);
         dish1.setWouldRecommend(true);

        DishTools.flipRecommendation(dish3);

        dish1.printSummary();
        dish2.printSummary();
        dish3.printSummary();

        DishTools.shoutDishName(dish2);
        DishTools.analyzeDishCost(dish3);

    }
}
