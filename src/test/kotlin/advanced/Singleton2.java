package advanced;

public class Singleton2 {
    // 이른 초기화
//    private static final Singleton INSTANCE = new Singleton();
//
//    public Singleton() {
//    }
//
//    public Singleton getInstance() {
//        return INSTANCE;
//    }


    // 지연 초기화
    public Singleton2() {
    }

    public Singleton2 getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

}
