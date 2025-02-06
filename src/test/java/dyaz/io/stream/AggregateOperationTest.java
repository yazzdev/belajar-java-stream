package dyaz.io.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {

  @Test
  void testMax() {
    List.of("Dyaz", "Amrullah", "Tokyo", "Kyoto", "Nagasaki", "Shibuya").stream()
            .max(Comparator.naturalOrder())
            .ifPresent(System.out::println);
  }

  @Test
  void testMin() {
    List.of("Dyaz", "Amrullah", "Tokyo", "Kyoto", "Nagasaki", "Shibuya").stream()
            .min(Comparator.naturalOrder())
            .ifPresent(System.out::println);
  }

  @Test
  void testCount() {
    long count = List.of("Dyaz", "Amrullah", "Tokyo", "Kyoto", "Nagasaki", "Shibuya").stream()
            .count();

    System.out.println(count);
  }

  @Test
  void testSum() {
    Integer result = List.of(1, 2, 3).stream()
            .reduce(0, (value, item) -> value + item);

    /*
     identity = 0
     1. value=0 + item=1 -> 1
     2. value=1 + item=2 -> 3
     3. value=3 + item=3 -> 6
    */

    System.out.println(result);
  }

  @Test
  void testFactorial() {
    Integer result = List.of(1, 2, 3).stream()
            .reduce(1, (value, item) -> value * item);

    /*
     identity = 1
     1. value=1 * item=1 -> 1
     2. value=1 * item=2 -> 2
     3. value=2 * item=3 -> 6
    */

    System.out.println(result);
  }
}
