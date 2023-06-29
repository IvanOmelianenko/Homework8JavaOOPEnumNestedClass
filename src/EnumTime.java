public class EnumTime {
    enum Meals {
        Breakfast("Time to breakfast"),
        Lunch("Time to lunch"),
        Dinner("Time to dinner");

        final String meals;

        Meals(String meals) {
            this.meals = meals;
        }
        public String getValue(){
            return meals;
        }

        public static void main(String[] args) {
            switch (10) {
                case 7:
                case 8:
                    System.out.println(Meals.Breakfast.getValue());
                    break;
                case 13:
                    System.out.println(Meals.Lunch.getValue());
                    break;
                case 19:
                    System.out.println(Meals.Dinner.getValue());
                    break;
                default:
                    System.out.println("This is not time to eat");

            }
        }

    }
}
