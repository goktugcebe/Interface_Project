import java.util.Arrays;

public class Ogs {
 static double [] append(double[] arr, double element) {
  final int N = arr.length;
  arr = Arrays.copyOf(arr, N + 1);
  arr[N] = element;
  return arr;
 }

public String  run(){

 double[] totalProfit=new double[]{};
 Car car=new Car();
 Bus bus=new Bus();
 Minibus minibus=new Minibus();
 car.hasOgs=true;
 minibus.hasOgs=false;
 bus.hasOgs=true;


 CounterImp counterImp1=new CarCounter();
 car.welcome();
 System.out.println(car.time());
 double carPayment=counterImp1.pay(car);
 if(carPayment==-1) {
  return "Process has been completed!";
 }

 totalProfit=append(totalProfit,carPayment);



 CounterImp counterImp2=new MinibusCounter();
 minibus.welcome();
 System.out.println(minibus.time());
 double minibusPayment=counterImp2.pay(minibus);
 if(minibusPayment==-1) {

  return "Process has been completed!";
 }

 totalProfit=append(totalProfit,minibusPayment);



 CounterImp counterImp3=new BusCounter();
 bus.welcome();
 System.out.println(bus.time());
 double busPayment= counterImp3.pay(bus);
 if(busPayment==-1) {

  return "Process has been completed!";
 }

 totalProfit=append(totalProfit,busPayment);



 Administration ad=new Administration();
 double total= ad.profit(totalProfit);
 System.out.println("-----------------");
 System.out.println("Daily total profit: "+total+" $");


 System.out.println("-----------------");
 return "Process has been completed!";


}}
