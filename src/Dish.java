class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;


    public void printSummary(){
        System.out.printf("Cost:  %d \nName: %s\nRecommended: %b", costInCents, nameOfDish, wouldRecommend);
    }
    public String getNameOfDish(String nameOfDish) {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish){
        this.nameOfDish = nameOfDish;
    }

    public void getCostInCents(int costInCents){
        this.costInCents = costInCents;
    }

    public void setCostInCents(int costInCents){
        this.costInCents = costInCents;
    }

    public void getWouldRecommend(boolean wouldRecommend){
        this.wouldRecommend = wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend){
        this.wouldRecommend = wouldRecommend;
    }

    public void dish(int costInCents, String nameOfDish, boolean wouldRecommend){
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public static class DishTest{
        public static void main(String[] args) {
            Dish dish1= new Dish(); //This creates a new object
            dish1.nameOfDish= "Brisket";
            dish1.costInCents = 200;
            dish1.wouldRecommend= false;

            dish1.printSummary();

        }
    }
}








