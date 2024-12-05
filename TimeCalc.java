public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));

        // doing the same thing for the minutes:
        int minutes = Integer.parseInt("" +args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        int MINUTES = (hours*60)+minutes+minutesToAdd;

        int HOURS = MINUTES/60;
        int newTimeHour= HOURS%24;
        int newTimeMinute= MINUTES-HOURS*60;
        if (newTimeHour<10) {System.out.print("0"+newTimeHour+":");}else{System.out.print(newTimeHour+":");}
        if (newTimeMinute<10) {System.out.print("0"+newTimeMinute);}else{System.out.print(newTimeMinute);}
            
        }

    
        // Replace this comment with your code
    }

