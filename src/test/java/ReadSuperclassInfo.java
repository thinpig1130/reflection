import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("부모 클래스 정보")
public class ReadSuperclassInfo {

    @Test
    @DisplayName("부모클래스 정보")
    void getSuperclass(){
        System.out.println(MyBook.class.getSuperclass());
    }
}
