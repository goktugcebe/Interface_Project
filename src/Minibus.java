import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Minibus extends Vehicle {


    public void welcome() {
        super.welcome();
        setNameSurname("Ahmet Tavus");
        setTypeVehicle("MiniBus");
        setOgsNo(72061220);
        System.out.println("Vehicle type: "+getTypeVehicle()+
                "\nName & Surname: "+getNameSurname()+
                "\nOGS NO: "+getOgsNo());
        System.out.println("-------------");

    }

}
