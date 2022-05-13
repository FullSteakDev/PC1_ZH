import java.util.ArrayList;

public class Waiter extends Chef{

    protected ArrayList<Chef> menu = new ArrayList<>();
    private static void modifyPrice(ArrayList<String[]> menu) {
        for (Chef menu : menus){
            if (menu.getRecipe().equals(recipe)){
                int price = inputPrice();
                menus.set(menus.indexOf(menu), new Chef(recipe, price));
                return;
            }
        }
    }
}
