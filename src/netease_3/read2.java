package netease_3;
/**
 * @Project: nowcoder_test
 * @Package netease_3
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年09月21日 15:11
 * @version V1.0
 */

import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.ArrayList;

/**
 * @author hzx
 * @createTime 21 15:11
 * @description
 */
public class read2 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l1.add("1");
        l2.add(1);
        System.out.println(l1.get(0).getClass());
        System.out.println(l2.get(0).getClass());
        System.out.println(l1.getClass() ==l2.getClass());
     }
}
