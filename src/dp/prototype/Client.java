package dp.prototype;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws Exception {
        Sheep s1 = new Sheep("多利", new Date());
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        s2.setName("少利");
        System.out.println(s2.getName());
        System.out.println(s2.getBirthday());
    }
}
