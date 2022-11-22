class MinibusCounter implements CounterImp {
   @Override
   public double pay(Vehicle vehicle) {
       System.out.println("The system is running...");
       if(!vehicle.hasOgs){
           System.out.println("OGS registration has not been activated. The payment process has been FAILED.\n"+"Please activate it as soon as possible!");
           return 0;
       }
       System.out.println("OGS registration has not been found!");
       System.out.println("The payment process has been successfully done. Have a safe drive! ");
       return 8;
   }
}

