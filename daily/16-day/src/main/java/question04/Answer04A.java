package question04;

public class Answer04A {
    public static void main(String[] args) {
        ThreadLocal threadLocal=ThreadLocal.withInitial(()->"ThreadLocal");
        System.out.println(threadLocal.get());
    }
}
