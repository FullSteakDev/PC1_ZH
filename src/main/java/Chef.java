import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Chef {

    public Chef() {
    }
    protected ArrayList<String[]> menu = new ArrayList<>();
    public void newRecipe (String recipe, String price) {
        String[] fogas = new String[1];
        fogas[0] = recipe;
        String[] ar = new String[1];
        ar[0] = price;
        Arrays.toString(ar);
        menu.add(fogas);
        menu.add(ar);
    }

    public void removeRecipe (String recipe)
    {
        for (int i = 0; i < menu.size(); i++) {
            if(Objects.equals(menu.get(i)[0], recipe))
            {
                menu.remove(i);
            }
        }
    }

    public String getMenu(){
        String price = "";
        if(menu.size() != 0){
            for (String[] all : menu) {
                if (all[1] == " -") {
                    price += all[0] + "<" + " " + ">" + all[1];
                } else {
                    price += all[0] + "<" + " " + ">" + all[1];
                }
            }
        }
        return price;
    }

    private String recipe;
    private int price;

    public Chef(String recipe, int price) {
        this.recipe = recipe;
        this.price = price;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
