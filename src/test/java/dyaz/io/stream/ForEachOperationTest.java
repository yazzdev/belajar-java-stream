package dyaz.io.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class ForEachOperationTest {

  @Test
  void testPeekBefore() {
    Stream.of("Dyaz", "Amrullah")
            .map(name -> {
              System.out.println("Before Change to Upper : " + name);
              String upper = name.toUpperCase();
              System.out.println("Change name to Upper -> " + upper);
              return upper;
            })
            .forEach(name -> System.out.println("Final Name : " + name));
  }

  @Test
  void testPeekAfter() {
    Stream.of("Dyaz", "Amrullah")
            .peek(name -> System.out.println("Before Change to Upper : " + name))
            .map(name -> name.toUpperCase())
            .peek(name -> System.out.println("Change Name to Upper -> " + name))
            .forEach(name -> System.out.println("Final Name : " + name));
  }

}
