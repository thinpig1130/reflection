package me.manylove.reflect;

import me.manylove.reflect.annotaion.NonDefaultValueAnnotation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("애노테이션 정보")
public class ReadAnnotationsInfo {

    @Test
    @DisplayName("에노테이션 정보")
    void getAnnotations(){
        Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);
    }

    @Test
    @DisplayName("상속된 에노테이션 정보")
    void getAnnotationInherited(){
        Arrays.stream(MyBook.class.getAnnotations()).forEach(System.out::println);
    }

    @Test
    @DisplayName("애노테이션 정보 직접참조")
    void getAnnotationValue(){
        Arrays.stream(Book.class.getAnnotations()).forEach(a -> {
            if( a instanceof NonDefaultValueAnnotation){
                NonDefaultValueAnnotation anno = (NonDefaultValueAnnotation) a;
                System.out.println(anno.name());
            }
        });
    }

}
