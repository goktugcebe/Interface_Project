import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bus extends Vehicle {

    public void welcome() {
        super.welcome();
        setNameSurname("Yagiz Yilmaz");
        setTypeVehicle("Bus");
        setOgsNo(73015214);
        System.out.println("Vehicle type: "+getTypeVehicle()+
                "\nName & Surname: "+getNameSurname()+
                "\nOGS NO: "+getOgsNo());
        System.out.println("-------------");

    }

}
