package refactor.jvmstatic;

public class JvmStaticExample {
    public static void main(String[] args) {
        String hello = HelloClass.Companion.hello();
        System.out.println(hello);

        String hi = HiObject.INSTANCE.hi();
        System.out.println(hi);

        // @JvmStatic이 있으면 이렇게 가능
        HelloClass.hello();
        HiObject.hi();
    }
}
