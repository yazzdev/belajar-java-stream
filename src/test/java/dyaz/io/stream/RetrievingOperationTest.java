package dyaz.io.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

  @Test
  void testLimit() {
    List.of("Dyaz", "Amrullah", "Teriyaki", "Omelet", "Takoyaki", "Dyaz", "Omelet").stream()
            .limit(2)
            .forEach(System.out::println);
  }

  @Test
  void testSkip() {
    List.of("Dyaz", "Amrullah", "Teriyaki", "Omelet", "Takoyaki", "Dyaz", "Omelet").stream()
            .skip(2)
            .forEach(System.out::println);
  }

  @Test
  void testTakeWhile() {
    List.of("Dyaz", "Omelet", "Amrullah", "Teriyaki", "Takoyaki", "Dyaz", "Omelet").stream()
            .takeWhile(name -> name.length() <= 6)
            .forEach(System.out::println);
  }

  @Test
  void testDropWhile() {
    List.of("Dyaz", "Omelet", "Amrullah", "Teriyaki", "Takoyaki", "Dyaz", "Omelet").stream()
            .dropWhile(name -> name.length() <= 6)
            .forEach(System.out::println);
  }

  // Retrieving Single Element

  @Test
  void testFindAny() {
    Optional<String> optional = List.of("Dyaz", "Amrullah", "Yokohama", "Tenjiku", "Tokyo").stream()
            .findAny();

    optional.ifPresent(System.out::println);
  }

  @Test
  void testFindFirst() {
    Optional<String> optional = List.of("Dyaz", "Amrullah", "Yokohama", "Tenjiku", "Tokyo").stream()
            .findFirst();

    optional.ifPresent(System.out::println);
  }
}
