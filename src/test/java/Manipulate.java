import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@DisplayName("클래스 정보 수정/실행")
public class Manipulate {

    @Test
    @DisplayName("인스턴스 생성/값 변경")
    void mani() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> bookClass = Class.forName("Book");
        //String name, String isbn, double randomNumber
        Constructor<?> constructor = bookClass.getConstructor(String.class, String.class, double.class);
        Book book = (Book) constructor.newInstance("kwondarc", "ISBN123456", 3.44);

        // public static 속성
        Field staticAttr = Book.class.getDeclaredField("staticAttr");
        System.out.println(staticAttr.get(null));
        staticAttr.set(null, "변경된값");
        System.out.println(staticAttr.get(null));

        // private static 속성
        Field secretStaticNumber = Book.class.getDeclaredField("secretStaticNumber");
        secretStaticNumber.setAccessible(true);
        System.out.println(secretStaticNumber.get(null));
        secretStaticNumber.set(null, 101);
        System.out.println(secretStaticNumber.get(null));

        // private 속성
        Field secretName = Book.class.getDeclaredField("secretName");
        secretName.setAccessible(true);
        System.out.println(secretName.get(book));
        secretName.set(book, "비밀스런다애");
        System.out.println(secretName.get(book));

        // private 메소드 실행
        Method sum = Book.class.getDeclaredMethod("sum", int.class, int.class);
        sum.setAccessible(true);
        System.out.println(sum.invoke(book, 1, 2));

    }

}
