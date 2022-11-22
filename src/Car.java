import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Car extends Vehicle{
    @Override
    public void welcome() {
        super.welcome();
        setNameSurname("Goktug Cebe");
        setTypeVehicle("Car");
        setOgsNo(71058946);
        System.out.println("Vehicle type: "+getTypeVehicle()+
                "\nName & Surname: "+getNameSurname()+
                "\nOGS NO: "+getOgsNo());
        System.out.println("-------------");

    }




}