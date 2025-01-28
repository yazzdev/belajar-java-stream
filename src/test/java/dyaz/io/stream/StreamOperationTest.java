package dyaz.io.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

  @Test
  void testStreamOperation() {

    List<String> names = List.of("Dyaz", "Amrullah");
    Stream<String> streamNames = names.stream();

    Stream<String> toUpperNames = streamNames.map(String::toUpperCase);

    toUpperNames.forEach(System.out::println);

    names.forEach(System.out::println);

  }
}
