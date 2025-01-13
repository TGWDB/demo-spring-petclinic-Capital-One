package org.springframework.samples.petclinic.vet;

import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SpecialtyDiffblueTest {
  /**
   * Test new {@link Specialty} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link Specialty}
   */
  @Test
  @DisplayName("Test new Specialty (default constructor)")
  void testNewSpecialty() {
    // Arrange and Act
    Specialty actualSpecialty = new Specialty();

    // Assert
    assertNull(actualSpecialty.getId());
    assertNull(actualSpecialty.getName());
  }
}
