package org.springframework.samples.petclinic.system;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CrashControllerDiffblueTest {
  /**
   * Test {@link CrashController#triggerException()}.
   * <p>
   * Method under test: {@link CrashController#triggerException()}
   */
  @Test
  @DisplayName("Test triggerException()")
  void testTriggerException() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange, Act and Assert
    assertThrows(RuntimeException.class, () -> (new CrashController()).triggerException());
  }
}
