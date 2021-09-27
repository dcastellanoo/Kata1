package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class KATA1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2001, 3, 30);
        
        Person persona1 = new Person("Diego", date);
        System.out.println(persona1.getName()+" tiene "+persona1.getAge()+ " años.");
    }
    
}
