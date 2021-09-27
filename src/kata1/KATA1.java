package kata1;

import java.util.Date;

public class KATA1 {

    public static void main(String[] args) {
        Person persona1 = new Person("Juan", new Date(89, 2, 21));
        System.out.println(persona1.getName()+" tiene "+persona1.getAge());
    }
    
}
