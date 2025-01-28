package dyaz.io.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class LazyEvaluationTest {

  @Test
  void testIntermediateOperation() {
    List<String> names = List.of("Dyaz", "Amrullah");

    names.stream()
            .map(name -> {
              System.out.println("Change " + name + " to UPPERCASE");
              return name.toUpperCase();
            });
  }

  @Test
  void testTerminalOperation() {
    List<String> names = List.of("Dyaz", "Amrullah");

    names.stream()
            .map(name -> {
              System.out.println("Change " + name + " to UPPERCASE");
              return name.toUpperCase();
            })
            .map(upper -> {
              System.out.println("Change " + upper + " to add Mr.");
              return "Mr. " + upper;
            })
            .forEach(System.out::println);
  }
}
