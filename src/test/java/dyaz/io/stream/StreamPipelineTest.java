package dyaz.io.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

  @Test
  void testWithoutStreamPipeline() {
    System.out.println("---- Test Without Stream Pipeline ----");

    List<String> name = List.of("Dyaz", "Sandhika");

    Stream<String> streamName = name.stream();

    Stream<String> toUpperName = streamName.map(String::toUpperCase);

    Stream<String> streamMr = toUpperName.map(upper -> "Mr. " + upper);

    streamMr.forEach(System.out::println);
  }

  @Test
  void testWithStreamPipeline() {
    System.out.println("---- Test With Stream Pipeline ----");

    List<String> name = List.of("Dyaz", "Sandhika");

    name.stream()
            .map(String::toUpperCase)
            .map(upper -> "Mr. " + upper)
            .forEach(System.out::println);
  }
}
