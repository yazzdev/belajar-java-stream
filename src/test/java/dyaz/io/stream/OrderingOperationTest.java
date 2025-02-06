package dyaz.io.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

  @Test
  void testSorted() {

    List.of("Dyaz", "Amrullah", "Tokyo", "Kyoto", "Nagasaki", "Shibuya").stream()
            .sorted()
            .forEach(System.out::println);

  }

  @Test
  void testShortedWithComparable() {
    Comparator<String> reverseComparator = Comparator.reverseOrder();

    List.of("Dyaz", "Amrullah", "Tokyo", "Kyoto", "Nagasaki", "Shibuya").stream()
            .sorted(reverseComparator)
            .forEach(System.out::println);
  }
}
