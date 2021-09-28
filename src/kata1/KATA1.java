package kata1;

import java.time.LocalDate;

public class KATA1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2001, 3, 30);
        
        Person persona1 = new Person("Diego", date);
        System.out.println(persona1.getName()+" tiene "+persona1.getAge()+ " años.");
    }
    
}
