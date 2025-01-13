package org.springframework.samples.petclinic.vet;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VetsDiffblueTest {
  /**
   * Test {@link Vets#getVetList()}.
   * <p>
   * Method under test: {@link Vets#getVetList()}
   */
  @Test
  @DisplayName("Test getVetList()")
  void testGetVetList() {
    // Arrange, Act and Assert
    assertTrue((new Vets()).getVetList().isEmpty());
  }

  /**
   * Test new {@link Vets} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link Vets}
   */
  @Test
  @DisplayName("Test new Vets (default constructor)")
  void testNewVets() {
    // Arrange, Act and Assert
    assertTrue((new Vets()).getVetList().isEmpty());
  }
}
