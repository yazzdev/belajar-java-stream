package dyaz.io.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CheckOperationTest {

  @Test
  void testAnyMatch() {
    boolean match = Stream.of(1,2,3,4,5,6,7)
            .anyMatch(number -> number > 5);

    System.out.println(match);
  }

  @Test
  void testNoneMatch() {
    boolean match = Stream.of(1,2,3,4,5,6,7)
            .noneMatch(number -> number > 6);

    System.out.println(match);
  }

  @Test
  void testAllMatch() {
    boolean match = Stream.of(1,2,3,4,5,6,7)
            .allMatch(number -> number > 4);

    System.out.println(match);
  }
}
