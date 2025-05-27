public class Day {
    public static void main(String[] args) {
    
        int days= 2;
        switch (days) {
            case 0: //monday
            case 1: //tuesday
            case 2: //wednesday
            case 3: //thursday
            case 4: //friday
            
            System.out.println("Weekday");
            break;
        
            case 5: //saturday
            case 6: //sunday
            System.out.println("Weekend");
                break;
        }
    }
}
