import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cardiologist implements Doctor {
    private String name;
    private int id;
    private Integer count;
    Map<Integer, ArrayList> appointments;

    public Cardiologist(String name, int id) {
        this.name = name;
        this.id = id;
        this.count = new Integer(0);
        this.appointments = new HashMap<Integer, ArrayList>();
    }

    public void getAppointment(String day, String time) {
        ArrayList<String> details = new ArrayList<String>();
        details.add(day);
        details.add(time);
        register(details);
    }

    private void register(ArrayList<String> details) {
        this.count += 1;
        this.appointments.put(this.count, details);
        System.out.println("Appointment with " + this.name + " on " + details.get(0) + " at " + details.get(1) + " is booked");
    }
}
