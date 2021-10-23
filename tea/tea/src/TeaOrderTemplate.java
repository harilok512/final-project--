public abstract class TeaOrderTemplate {
    public abstract void displayMenu();
    public abstract void takeOrder();
    public abstract void serveOrder();

    public final void getTea(){

       displayMenu();
       takeOrder();
       serveOrder();
    }
}
