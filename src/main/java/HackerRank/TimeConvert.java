package HackerRank;

public class TimeConvert {

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */

        //07:05:45PM

        String[] time = new String[4];
        time[0] = s.substring(0, 2);
        time[1] = s.substring(3, 5);
        time[2] = s.substring(6, 8);
        time[3] = s.substring(8);

        if (time[3].equals("PM")){
            int hour = Integer.valueOf(time[0]) + 12;
            if (hour < 10){
                time[0] = "0" + hour;
            } else if (hour != 24) {
                time[0] = String.valueOf(hour);
            } else {
                time[0] = "12";
            }
        } else if (time[3].equals("AM") && time[0].equals("12")){
            time[0] = "00";
        }
        return String.join(":", time[0], time[1], time[2]);
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }

}
