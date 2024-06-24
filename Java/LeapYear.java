public class LeapYear {

    boolean isLeap(int Year){
        return (Year % 4 == 0 || (Year % 100 == 0 && Year % 400 == 0));
    }    
}
