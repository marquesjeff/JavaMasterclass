public class Main {

    public static void main(String[] args) {
        SmartKitchen newKitchen = new SmartKitchen();

        newKitchen.getBrewMaster().setHasWorkToDo(true);
        newKitchen.getDishWasher().setHasWorkToDo(true);
        newKitchen.getIceBox().setHasWorkToDo(true);
        newKitchen.doKitchenWork();

    }
}
