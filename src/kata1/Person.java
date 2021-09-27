package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Person {
    private final String name; 
    private final Calendar birthday;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public int getAge(){
        Calendar today  =GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birthday.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles){
        return milles / MILLISECONDS_PER_YEAR;
    }
    
}