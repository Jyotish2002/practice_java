public class test03 {
    public static void main(String[] args) {
        int day=3;
        String dayname = null;
        switch(day){
            case 1:
            dayname="Sunday";
            break;
            case 2:
            dayname="Monday";
            break;
            case 3:
            dayname="Tuesday";
            break;
            case 4:
            dayname="wednesday";
            break;
            case 5:
            dayname="Thrusday";
            break;
            case 6:
            dayname="Friday";
            break;
            case 7:
            dayname="Saturday";
            break;
        }
        System.out.println(dayname);
    }
}
