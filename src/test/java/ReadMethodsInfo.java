import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

@DisplayName("메소드 정보")
public class ReadMethodsInfo {

    @Test
    @DisplayName("public 메소드 목록")
    void getMethods(){
        Arrays.stream(MyBook.class.getMethods()).forEach(System.out::println);
    }

    @Test
    @DisplayName("모든 메소드 목록 상세 (modifiers, 반환타입, 파라미터 정보)")
    void getDeclaredMethods(){
        Arrays.stream(Book.class.getDeclaredMethods()).forEach(m -> {
            int modifiers = m.getModifiers();
            System.out.println(m);
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(Modifier.isStatic(modifiers));
            System.out.println(Modifier.isPublic(modifiers));

            System.out.println(m.getReturnType());
            System.out.println(m.getParameterCount());
        });
    }

}
