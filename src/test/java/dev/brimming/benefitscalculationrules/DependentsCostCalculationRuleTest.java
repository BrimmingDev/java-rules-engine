package dev.brimming.benefitscalculationrules;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import dev.brimming.Employee;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

public class DependentsCostCalculationRuleTest {

  private final DependentsCostCalculationRule rule = new DependentsCostCalculationRule();

  @Test
  public void itShouldReturnTwelveHundredForTwoDependents() {
    Employee employee = Instancio.create(Employee.class).withNumOfDependents(2);

    assertThat(rule.calculateCosts(employee)).isEqualTo(1200.00);
  }
}
