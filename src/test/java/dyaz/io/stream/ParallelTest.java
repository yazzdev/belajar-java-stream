package dyaz.io.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class ParallelTest {
  @Test
  void testSequential() {

    Stream.of(1,2,3,4,5,6,7,8,9,10)
            .forEach(number -> {
              System.out.println(Thread.currentThread().getName() + " : " + number);
            });

  }

  @Test
  void testParallel() {

    Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
            .parallel()
            .forEach(number -> {
              System.out.println(Thread.currentThread().getName() + " : " + number);
            });

  }
}
