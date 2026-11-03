public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater(){
        brewMaster.setHasWorkToDo(true);
        System.out.println("Adding water...");
    }

    public void pourMilk(){
        iceBox.setHasWorkToDo(true);
        System.out.println("Pouring milk...");
    }

    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
        System.out.println("Loading dish washer...");
    }

    public void setKitchenSate(boolean coffeeState, boolean dishWasherState,
                               boolean refrigeratorState){
        brewMaster.setHasWorkToDo(coffeeState);
        dishWasher.setHasWorkToDo(dishWasherState);
        iceBox.setHasWorkToDo(refrigeratorState);

    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
