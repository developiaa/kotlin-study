package refactor.extensions;

public class ExtensionExample {
    public static void main(String[] args) {
        char abcd = MyExtensionsKt.first("ABCD");
        System.out.println(abcd);
        String s = MyExtensionsKt.addFirst("ABCD", 'Z');
        System.out.println(s);
    }
}
