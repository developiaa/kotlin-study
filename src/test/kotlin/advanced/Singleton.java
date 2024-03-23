package advanced;

public class Singleton {
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
    public Singleton() {
    }

    public Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

}
