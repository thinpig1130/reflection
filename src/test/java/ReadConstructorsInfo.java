import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.util.Arrays;

@DisplayName("생성자 정보")
public class ReadConstructorsInfo {
    @Test
    @DisplayName("생성자")
    void getConstructors(){
        Arrays.stream(Book.class.getConstructors()).forEach(System.out::println);
    }


}
