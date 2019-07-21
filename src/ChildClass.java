/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年06月11日 13:38
 * @version V1.0
 */

/**
 *@author hzx
 *@createTime 11 13:38
 *@description
 */
public class ChildClass extends FatherClass {
    public ChildClass(){
        System.out.println("CC Create");
    }

    public static void main(String[] args) {
        FatherClass fc = new FatherClass();
        ChildClass cc = new ChildClass();
    }
}
