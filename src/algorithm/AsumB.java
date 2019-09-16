package algorithm;

import java.util.ArrayList;
import java.util.Scanner;


public class AsumB {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String lines=scan.nextLine();
        String[] arr=lines.split(",");
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i].trim();
        }
        long result=0;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(Long.parseLong(arr[i])+Long.parseLong(arr[j])==0 && sb.indexOf(j+"")==-1 && sb.indexOf(i+"")==-1){
                    sb.append(i+"&"+j);
                    result++;
                }
            }
        }
        System.out.println(result);
/*        for(String str:arr){
            System.out.println(str);
        }*/
    }
}