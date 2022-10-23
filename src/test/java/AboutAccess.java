package me.manylove.reflect;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("Class<T> 접근 방법")
public class AboutAccess {

    @Test
    @DisplayName("타입을 이용한 접근")
    void accessByClassType(){
        Class<Book> bookClassByClassType = Book.class;
        Arrays.stream(bookClassByClassType.getFields()).forEach(System.out::println);
    }

    @Test
    @DisplayName("인스턴스를 이용한 접근")
    void accessByInstance(){
        Book book = new Book();
        Class<? extends Book> bookClassByInstance = book.getClass();
        Arrays.stream(bookClassByInstance.getFields()).forEach(System.out::println);
    }

    @Test
    @DisplayName("FQCN을 이용한 접근")
    void accessByFQCN(){
        Class<?> bookClassByFQCN = null;
        try {
            bookClassByFQCN = Class.forName("me.manylove.reflect.Book");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Arrays.stream(bookClassByFQCN.getFields()).forEach(System.out::println);
    }
}
