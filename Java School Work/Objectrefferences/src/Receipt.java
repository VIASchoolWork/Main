import java.util.ArrayList;

public class Receipt {

    String receiptnumber;
    String firstname;
     ArrayList<OrderPart> partsList = new ArrayList<>();
    static ArrayList<OrderPart> copy = new ArrayList<>();

    Receipt(String receiptnumber, String firstname){
        this.receiptnumber = receiptnumber;
        this.firstname = firstname;
    }
    void addOrder(CarPart part, int count){
        this.partsList.add(new OrderPart(part,count));
        this.copy.add(new OrderPart(part,count));
    }

    public static String printparts(int a){
        if(copy.get(a).count == 1){
            return String.valueOf(+copy.get(a).count+ " "+ ""+copy.get(a).part.name);
        }
        else {
            return String.valueOf(+copy.get(a).count+ " "+ ""+copy.get(a).part.name + "s");
        }

    }

    double totalprice() {
        double sum = 0;
        for (int i = 0; i < partsList.size(); i++) {
            int amount = partsList.get(i).count;
            double price = partsList.get(i).part.price;
            sum = sum + amount * price;
        }
        return sum;
    }

}