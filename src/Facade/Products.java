package Facade;

public class Products {
    private Drinks drinks;
    private Popcorn popcorn;

    public Products(){
        this.drinks = new Drinks();
        this.popcorn= new Popcorn();
    }
    public void ProductsInfo(){
        drinks.drinkInfo();
        popcorn.popcornInfo();
    }
}
