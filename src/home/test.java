/**
 * Created by Administrator on 2019/8/24.
 */
package home;
public class test {
    public static void main(String[] args) {
        Integer a1 = 101;
        Integer b1 = 101;
        if (a1 == b1) {
            System.out.println("eqials");

        } else {
            System.out.println("not");
        }
        Integer a2 = -101;
        Integer b2 = -101;
        if (a2 == b2) {
            System.out.println("eq");

        } else {
            System.out.println("nit");
        }

        Ani ani = new Dog();
        System.out.println(ani.x);
    }
}

class Ani {
    int x = 1;

    public Ani() {
        System.out.println("animal");
    }
}

class Dog extends Ani {
    int x = 2;

    public Dog() {
        System.out.println("dog");
    }
}
