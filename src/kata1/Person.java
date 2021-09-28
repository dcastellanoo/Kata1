package kata1;

import java.time.LocalDate;
import java.time.Period;


public class Person {
    private final String name; 
    private final LocalDate birthday;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge(){
        return (int) (Period.between(birthday, LocalDate.now()).getYears());
    } 
}