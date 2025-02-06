package dyaz.io.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {

  @Test
  void testFilter() {

    List.of("Dyaz", "Amrullah", "Teriyaki", "Omelet", "Takoyaki", "Dyaz", "Omelet").stream()
            .filter(name -> name.length() > 4)
            .forEach(System.out::println);

    List.of(1,2,3,4,5,6,7,8,9,10).stream()
            .filter(genap -> genap % 2 == 0)
            .forEach(System.out::println);

  }

  @Test
  void testDistinct() {

    List.of("Dyaz", "Amrullah", "Teriyaki", "Omelet", "Takoyaki", "Dyaz", "Omelet").stream()
            .distinct()
            .forEach(System.out::println);

  }
}
