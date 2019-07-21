/**
 * @Project: nowcoder_test
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @author : hzx
 * @date Date : 2019年02月25日 20:15
 * @version V1.0
 */

/**
 *@author hzx
 *@createTime 19125 20:15
 *@description main
 */

    class Two{
        Byte x;
    }
    class PassO{
        public static void main(String[] args){
            PassO p=new PassO();
            p.start();
        }
        void start(){
            Two t=new Two();
            System.out.print(t.x+ " ");
            Two t2=fix(t);
            System.out.print(t.x+" " +t2.x);
        }
        Two fix(Two tt){
            tt.x=42;
            return tt;
        }
    }

