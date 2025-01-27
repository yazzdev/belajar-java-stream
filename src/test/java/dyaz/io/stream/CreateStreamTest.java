package dyaz.io.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStreamTest {

  @Test
  void testCreateEmptyOrSingleStream() {
    System.out.println("---- Test Create Empty Or Single Stream ----");

    Stream<String> emptyStream = Stream.empty();
    // with lambda
    emptyStream.forEach(empty -> System.out.println(empty));

    Stream<String> oneStream = Stream.of("Dyaz");
    // with method reference
    oneStream.forEach(System.out::println);

    String data = null;
    Stream<String> emptyOrNotStream = Stream.ofNullable(data);
    emptyOrNotStream.forEach(System.out::println);

  }

  @Test
  void testCreateStreamFromArray() {
    System.out.println("---- Test Create Stream From Array ----");

    Stream<String> arrayStream = Stream.of("Dyaz", "Amrullah");
    arrayStream.forEach(System.out::println);

    Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
    integerStream.forEach(integer -> System.out.println(integer));

    String[] array ={
            "Dyaz", "Amrullah"
    };
    Stream<String> streamFromArray = Arrays.stream(array);
    streamFromArray.forEach(name -> {
      System.out.println(name);
    });

  }
}
