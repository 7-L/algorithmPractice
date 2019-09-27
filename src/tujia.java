import java.util.Scanner;

public class tujia {
    //    守望者的逃离
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long um = in.nextLong();
        long ud = in.nextLong();
        long us = in.nextLong();
        help2(um,ud,us);
    }



    public static void help2(long m, long s, long t) {

        int d1 = 0, d2 = 0;
        int temp = 0;
        for (int i = 1; i <= t; i++) {

            if (m >= 10) {
                d1 += 50;
                m -= 10;
            } else {
                m += 4;
            }
            if (d1 > d2 + 13)
                d2 = d1;
            else
                d2 += 13;
            temp = i;
        }
        if(temp>t){
            System.out.println("No");
            System.out.println(d2);}
        else{
            System.out.println("Yes");
            System.out.println(temp);
        }

    }
//    public static void help(long um, long ud, long us) {
//        long spaceElse = 0, timeleftElse = us;
//        while (um >= 10 && us > 0 && ud - spaceElse > 0) {
//            if (ud - spaceElse > 17) {
//                spaceElse += 60;
//                um -= 10;
//                us--;
//            } else {
//                System.out.println("Yes" + (timeleftElse - us + 1));
//            }
//        }
//        while (us > 0 && ud - spaceElse > 0) {
//            if ((um == 0 || um == 1) && us >= 7 && ud - spaceElse > 102) {
//                us -= 7;
//                spaceElse += 120;
//            } else if (um >= 2 && um <= 5 && us >= 3 && ud - spaceElse > 34) {
//                um -= 2;
//                us -= 3;
//                spaceElse += 60;
//            } else if (um >= 6 && us >= 2 && ud - spaceElse > 17) {
//                um -= 6;
//                us -= 2;
//                spaceElse += 60;
//            } else {
//                spaceElse += 17;
//                us--;
//            }
//        }
//        if (ud < spaceElse) {
//            System.out.println("Yes" + (timeleftElse - us));
//
//        }else {

//            System.out.println("No" + spaceElse);
//        }

//    }
}
