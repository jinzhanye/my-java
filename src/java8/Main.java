package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void demo01() {
        // 将函数当作参数
        System.out.println("first even is:" +
                values.stream()
                        .filter(Main::isEven)
                        .collect(Collectors.toList()));
    }


    public static void demo02() {
        // Predicate 用于断言必须返回一个布尔值
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // 调用 Predicate
        // isEven.test(2);

        // 将函数当作参数
        System.out.println("first even is:" +
                values.stream()
                        .filter(isEven)
                        .collect(Collectors.toList()));
    }

    public static void demo03() {
        // Function用于转换一个类型成另一个类型，比如下面将Integer转成Predicate<Integer>
        // pivot为自由变量
        Function<Integer, Predicate<Integer>> isGreaterThan = pivot ->
                number -> number > pivot;

        System.out.println("Greater than 3 is: " +
                values.stream()
                        .filter(isGreaterThan.apply(3))
                        .collect(Collectors.toList()));
    }

    // Consumer 用于接收一个对象进行处理但没有返回
    // "<>"里放一个Map或者对象实现多参数传递
    public static void simpleCallback(Consumer<String> callback) {
        try {
            Thread.sleep(1);
            callback.accept("I am back");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        simpleCallback(msg -> System.out.println(msg));
    }

//    参考
//    https://www.ibm.com/developerworks/cn/java/j-java8idioms5/index.html?ca=drs-
}
