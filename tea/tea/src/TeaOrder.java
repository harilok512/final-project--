import java.util.ArrayList;
import java.util.Scanner;

public class TeaOrder extends TeaOrderTemplate{
    Scanner input = new Scanner(System.in);
    int teaSelection;
    TeaFactory teaFactory=new TeaFactory();
    ArrayList<Integer> extras=new ArrayList<Integer>();

    @Override
    public void displayMenu() {

        System.out.println("Choose from menu");
        System.out.println("1.Black tea");
        System.out.println("2.Green tea");
        System.out.println("3.Oolong tea");
        System.out.println("4.White tea");

    }

    @Override
    public void takeOrder() {
        int choice;
        System.out.print("Choice: ");
        choice=input.nextInt();
        if(choice==1){
            Tea t=teaFactory.getTea("Black");
            t=displayIngredient(t);
            System.out.println(t.makeTea());
        }else if(choice==2){
            Tea t=teaFactory.getTea("Green");
            t=displayIngredient(t);
            System.out.println(t.makeTea());
        }else if(choice==3){
            Tea t=teaFactory.getTea("White");
            t=displayIngredient(t);
            System.out.println(t.makeTea());
        }else if(choice==4){
            Tea t=teaFactory.getTea("Oolong");
            t=displayIngredient(t);
            System.out.println(t.makeTea());
        }else {
            System.out.println("Wrong input");
        }
    }


    @Override
    public void serveOrder() {
        System.out.println("Tea is served");
    }


    public Tea displayIngredient(Tea t){
        int count;
        boolean a=true;
        while(a){
            System.out.println();
            if(extras.size()==3){
                break;
            }
            System.out.println("Choose extras from menu");
            System.out.println("1.Brown sugar");
            System.out.println("2.Cutting");
            System.out.println("3.Ginger");
            System.out.println("4.No more extras");
            int choice;
            System.out.print("Choice: ");
            choice=input.nextInt();


            if(choice==1){
                boolean x=true;
                for(int i=0;i<extras.size();i++){
                    if(extras.get(i)==1){
                        System.out.println("Brown sugar already added");
                        x=false;
                    }
                }
                if(x){
                    t=new BrownSugarDecorator(t);
                    System.out.println("Brown sugar added");
                    extras.add(1);
                }

            }else if(choice==2){
                boolean x=true;
                for(int i=0;i<extras.size();i++){
                    if(extras.get(i)==2){
                        System.out.println("Cutting tea already added");
                        x=false;
                    }
                }
                if(x) {
                    t = new CuttingTeaDecorator(t);
                    System.out.println("Cutting tea added");
                    extras.add(2);
                }
            }else if(choice==3){

                boolean x=true;
                for(int i=0;i<extras.size();i++){
                    if(extras.get(i)==3){
                        System.out.println("Ginger already added");
                        x=false;
                    }
                }

                if(x) {
                    System.out.println("Ginger added");
                    t = new GingerDecorator(t);
                    extras.add(3);
                }
            }else if(choice==4){
                a=false;
            }else {
                System.out.println("Wrong input");
            }
        }

        return t;

    }
}
