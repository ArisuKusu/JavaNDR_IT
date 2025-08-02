package NDR.src;

public class TestTimeModern {
    public static void main(String[] args) {
        TimeModern t = new TimeModern(23,59,59);
        System.out.println("Start time: "+t);

        TimeModern t2 = t.nextSecond();
        System.out.println("After 1 second: "+t2);

        TimeModern t3 = t2.nextSecond();
        System.out.println("After 2 more second: "+t3);

        //Getters
        System.out.println("Hour: "+ t3.getHour());
        System.out.println("Minute: "+ t3.getMinute());
        System.out.println("Second: "+ t3.getSecond());

        //Create new time 
        TimeModern t4 = t3.withTime(7, 30, 15);
        System.out.println("New time with withTime()"+ t4);

    }
    
}
