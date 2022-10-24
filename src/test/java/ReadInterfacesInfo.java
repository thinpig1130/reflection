import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("인터페이스 정보")
public class ReadInterfacesInfo {

    @Test
    @DisplayName("인터페이스 목록")
    void getInterfaces(){
        Arrays.stream(MyBook.class.getInterfaces()).forEach(System.out::println);
    }

}
