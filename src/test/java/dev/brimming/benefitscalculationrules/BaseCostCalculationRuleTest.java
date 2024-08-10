package dev.brimming.benefitscalculationrules;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import dev.brimming.Employee;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

public class BaseCostCalculationRuleTest {

  private final BaseCostCalculationRule baseCostCalculationRule = new BaseCostCalculationRule();

  @Test
  public void itShouldReturnOneThousand() {
    Employee employee = Instancio.create(Employee.class);

    assertThat(baseCostCalculationRule.calculateCosts(employee)).isEqualTo(1000.00);
  }
}
