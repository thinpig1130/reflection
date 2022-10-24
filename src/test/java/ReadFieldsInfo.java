import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

@DisplayName("속성(Fields)")
public class ReadFieldsInfo {

    @Test
    @DisplayName("public 속성")
    void getFields(){
        Arrays.stream(MyBook.class.getFields()).forEach(System.out::println);
    }

    @Test
    @DisplayName("모든 속성/값")
    void getDeclaredFields(){
        Book book = new Book();
        Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
            f.setAccessible(true); //접근 불가 필드까지 접근 가능하도록 만들어 줌
            try {
                // 인스턴스에 속한 속성 값을 읽기 위해서는 인스턴스 함께 넘겨 줘야 함.
                System.out.printf("%s %s \n", f, f.get(book));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Test
    @DisplayName("modifiers 정보")
    void getModifiers(){
        Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
            int modifiers = f.getModifiers();
            System.out.println(f);
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(Modifier.isStatic(modifiers));
            System.out.println(Modifier.isPublic(modifiers));
        });
    }

}
