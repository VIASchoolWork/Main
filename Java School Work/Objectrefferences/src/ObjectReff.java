import java.util.ArrayList;

public class ObjectReff {
    public static void main(String[] args){
        CarPart p1 = new CarPart("Fuel pump","Hella",80);
        CarPart p2 = new CarPart("Window regulator","Valeo",93.5);
        CarPart p3 = new CarPart("Window wiper","Bosch",25);
        CarPart p4 = new CarPart("Thermostat","Hella",20.05);
        CarPart p5 = new CarPart("Thermostat","Mahle",19.95);
        CarPart p6 = new CarPart("Thermostat","Topran",22.99);
        CarPart p7 = new CarPart("Windshield","pilkington", 249.99);

        ArrayList<CarPart> carparts = new ArrayList<>();
        carparts.add(p1);
        carparts.add(p2);
        carparts.add(p3);
        carparts.add(p4);
        carparts.add(p5);
        carparts.add(p6);
        carparts.add(p7);

        //System.out.println(carparts.toString());

        Receipt r1 = new Receipt("JK320312","Jim");
        Receipt r2 = new Receipt("JK293912","Pam");
        Receipt r3 = new Receipt("JK232422","Dwight");
        Receipt r4 = new Receipt("JK232333","Andy");

        ArrayList<Receipt> receipt = new ArrayList<>();
        receipt.add(r1);
        receipt.add(r2);
        receipt.add(r3);
        receipt.add(r4);

        r1.addOrder(p1,2);
        r2.addOrder(p3,2);
        r3.addOrder(p6,1);
        r4.addOrder(p7,2);



        for(int i =0; i<receipt.size(); i++){
            System.out.println("Receipt no."+receipt.get(i).receiptnumber+": Name:"+receipt.get(i).firstname+
                    " Spent "+receipt.get(i).totalprice()+"$ in total");
            System.out.println(receipt.get(i).firstname+" bought: "+Receipt.printparts(i));

        }





    }
}
