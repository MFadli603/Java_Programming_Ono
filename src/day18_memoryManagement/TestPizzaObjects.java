package day18_memoryManagement;

public class TestPizzaObjects {
    public static void main(String[] args) {

       Pizza pizza1 =new Pizza();
    //   pizza1.size ='M';
pizza1.setInfo('L', 2,2);
       Pizza pizza2 = new Pizza();
     //  pizza2.size = 'L';
pizza2.setInfo('M', 1,3);

        System.out.println(pizza1);
        System.out.println(pizza2);

        System.out.println("_________________________________");

double total =0;
        for (int i = 0; i < 20; i++) {
            
            Pizza small = new Pizza();
            small.setInfo('S',2,2);
            total += small.calcCost();
            
            Pizza medium = new Pizza();
            medium.setInfo('M', 3,4);
            total+= medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('L', 4,5);
            total += large.calcCost();
        }
        System.out.println("total = " + total);
    }
}
