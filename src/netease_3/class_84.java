package netease_3;
/**
 * @Project: nowcoder_test
 * @Package netease_3
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年09月23日 19:23
 * @version V1.0
 */

/**
 *@author hzx
 *@createTime 23 19:23
 *@description
 */

import java.util.Scanner;
public class class_84
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        do
        {
            int zz=0;
            int M=sc.nextInt();
            if(M<5)
            {
                System.out.println(0);
                continue;
            }
            while(M>=5)
            {
                M=M/5;
                zz=M+zz;
            }
            System.out.println(zz);
            N--;
        }while(N>0);
        sc.close();
    }

}

class test {

    private void test() {

        String aStr = "CAT";
        String bStr = aStr;
        aStr.toLowerCase();
        aStr.replace("c", "W");
        System.out.println(aStr + bStr);
    }

    static public void main(String[] a) {

        new test().test();
    }
}
/*public class _84 {


	static int f(int M)
	{
		if(M==5)
			return 1;
		if(M<5)
			return 0;
		int m=M/5;
		return f(m)+m;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int zz;
		do
		{
			int M=sc.nextInt();
				zz=f(M);
			System.out.println(zz);
			N--;
		}while(N>0);
		sc.close();
	}

	*/

