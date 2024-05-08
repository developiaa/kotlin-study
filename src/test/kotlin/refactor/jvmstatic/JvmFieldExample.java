package refactor.jvmstatic;

public class JvmFieldExample {
    public static void main(String[] args) {

        // 코틀린에서 @JvmField 를 사용하기 전
//        int id = JvmFieldClass.Companion.getId();
//        System.out.println(id);
//        String name = JvmFieldObject.INSTANCE.getName();
//        System.out.println(name);

        // 코틀린에서 @JvmField 를 사용
        int id2 = JvmFieldClass.id;
        System.out.println(id2);
        String name2 = JvmFieldObject.name;
        System.out.println(name2);


        int code = JvmFieldClass.CODE;
        System.out.println(code);
        String familyName = JvmFieldObject.FAMILY_NAME;
        System.out.println(familyName);
    }
}
