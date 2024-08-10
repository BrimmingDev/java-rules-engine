package dev.brimming.benefitscalculationrules;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import dev.brimming.Employee;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

class SalaryGreaterThanEightyThousandCalculationRuleTest {

  private final SalaryGreaterThanEightyThousandCalculationRule rule =
      new SalaryGreaterThanEightyThousandCalculationRule();

  @Test
  public void itShouldReturnZeroIfSalaryIsLessThanEightyThousand() {
    Employee employee = Instancio.create(Employee.class).withSalary(79999.99);

    assertThat(rule.calculateCosts(employee)).isEqualTo(0);
  }

  @Test
  public void itShouldReturnSalaryPlusTwoPercentIfSalaryIsGreaterThanOrEqualToEightyThousand() {
    Employee employee = Instancio.create(Employee.class).withSalary(80000.00);

    assertThat(rule.calculateCosts(employee)).isEqualTo(16.00);
  }
}
