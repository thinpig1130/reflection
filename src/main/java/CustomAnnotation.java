import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited
public @interface CustomAnnotation {

    // 어떤 값을 같는 키워드를 value 라고 입력하면 이름을 생략한 후에 값을 입력할 수 있다.
    String value() default "hash_2";

    String name() default "kwondarc";

    int number() default 100;

}