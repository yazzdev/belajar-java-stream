package dyaz.io.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

  @Test
  void testCreateStreamBuilder() {

    System.out.println("---- Test Create Stream Builder ----");

    Stream.Builder<String> stringBuilder = Stream.builder();
    stringBuilder.accept("Dyaz");
    stringBuilder.add("Amrullah").add("Stream");

    Stream<String> stringStream = stringBuilder.build();
    stringStream.forEach(System.out::println);

  }

  @Test
  void testCreateStreamBuilderSimplify() {

    System.out.println("---- Test Create Stream Builder Simplify ----");

    Stream<Object> stream = Stream.builder()
            .add("Dyaz").add("Amrullah").build();

    stream.forEach(System.out::println);

  }
}
