public class Dish {
    public static void main(String[] args) {
        Post dish1 = new Post();
        dish1.nameOfDish = "Brisket";
        dish1.costInCents = 40_000;
        dish1.wouldRecommend = false;
        System.out.println(dish1.printSummary());

    }

}

class Post {
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public String  printSummary() {
        return  "\nCost in cents: " + costInCents +  "\n"+
                "Name of dish: " + nameOfDish + "\n" +
                "Would Recommend: " + wouldRecommend + "\n";
    }

    public String updatePrintSummary(int costInCents, String nameOfDish, boolean wouldRecommend){
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;

        return this.printSummary();
    }
};