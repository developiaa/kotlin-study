package refactor.throwtest;

import java.io.IOException;

public class JavaThrow {
    public void throwIOException() throws IOException {
        throw new IOException("checked exception 발생!!!");
    }

    public static void main(String[] args) {
//        JavaThrow javaThrow = new JavaThrow();
//        try {
//            javaThrow.throwIOException();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//
        KotlinThrow kotlinThrow = new KotlinThrow();
//        kotlinThrow.throwIOException(); // 가능

        try{
            kotlinThrow.throwIOException();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
