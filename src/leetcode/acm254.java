package leetcode;
/**
 * @Project: nowcoder_test
 * @Package leetcode
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年08月27日 20:23
 * @version V1.0
 */

import sun.rmi.runtime.Log;

import java.lang.reflect.Constructor;

/**
 *@author hzx
 *@createTime 27 20:23
 *@description
 */
public class acm254 {

    public static void main(String[] args) throws Throwable {
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);           // false
        String s3 = s1.intern();
        String s4 = s1.intern();
        System.out.println(s3 == s4);

        initByDefaultConst();


    }

    public static void initByDefaultConst() throws Throwable {

        Class temp = Class.forName("leetcode.leetcode386");

        Object obj = temp.newInstance();

        Constructor constructor = temp.getConstructor();



        System.out.println(temp.getName());


    }



}
