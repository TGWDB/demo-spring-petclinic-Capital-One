package org.springframework.samples.petclinic.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link Person}
   *   <li>{@link Person#setFirstName(String)}
   *   <li>{@link Person#setLastName(String)}
   *   <li>{@link Person#getFirstName()}
   *   <li>{@link Person#getLastName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  void testGettersAndSetters() {
    // Arrange and Act
    Person actualPerson = new Person();
    actualPerson.setFirstName("Jane");
    actualPerson.setLastName("Doe");
    String actualFirstName = actualPerson.getFirstName();

    // Assert
    assertEquals("Doe", actualPerson.getLastName());
    assertEquals("Jane", actualFirstName);
    assertNull(actualPerson.getId());
  }
}
