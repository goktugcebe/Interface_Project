import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vehicle{

    public boolean hasOgs;

    private String typeVehicle;
    private int ogsNo;
    private String nameSurname;


    public void welcome(){
        System.out.println("-----------------");
        System.out.println("Welcome to the OGS system!");
    }

    public String time(){
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate=dateTime.format(dateTimeFormatter);
        String time=formattedDate;
        System.out.println("System operating date and time: ");
        return time;
    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public int getOgsNo() {
        return ogsNo;
    }

    public void setOgsNo(int ogsNo) {
        this.ogsNo = ogsNo;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }
}
