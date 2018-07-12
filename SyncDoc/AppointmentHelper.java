import java.util.HashMap;
import java.util.Map;

public class AppointmentHelper {
    public static void bookAppointment(String doctor_name, String day, String time) {
        Map<String, Doctor> doctors = new HashMap<String, Doctor>();
        doctors.put("adam", new Physician("Adam", 123));
        doctors.put("alice", new Cardiologist("Alice", 456));
        doctors.put("brian", new Surgeon("Brian", 789));
        doctors.put("martha", new Endocrinologist("Martha", 111));
        doctors.put("cathy", new Dermatologist("Cathy", 321));
        doctors.put("jake", new Hematologist("Jake", 654));
        doctors.put("krishna", new Nephrologist("Krishna", 987));
        doctors.put("sudhakar", new Neurologist("Sudhakar", 357));
        doctors.put("nalini", new Oncologist("Nalini", 246));
        doctors.put("hasini", new Opthamologist("Hasini", 907));

        String key = doctor_name.toLowerCase();

        Doctor doc = doctors.get(key);
        doc.getAppointment(day, time);

    }
}
