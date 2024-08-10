package dev.brimming;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import dev.brimming.benefitscalculationrules.BenefitsCostCalculationRule;
import java.util.Set;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

class BenefitsCostCalculatorServiceTest {

  private static class TestRuleOne implements BenefitsCostCalculationRule {

    @Override
    public double calculateCosts(Employee employee) {
      return 100.00;
    }
  }

  private static class TestRuleTwo implements BenefitsCostCalculationRule {

    @Override
    public double calculateCosts(Employee employee) {
      return 200.00;
    }
  }

  private static class TestRuleThree implements BenefitsCostCalculationRule {

    @Override
    public double calculateCosts(Employee employee) {
      return -50.00;
    }
  }

  private final BenefitsCostCalculatorService service =
      new BenefitsCostCalculatorService(
          Set.of(new TestRuleOne(), new TestRuleTwo(), new TestRuleThree()));

  @Test
  public void itProcessesAllRulesAndSumsTheResultCorrectly() {
    Employee employee = Instancio.create(Employee.class);

    assertThat(service.calculateBenefitsCost(employee)).isEqualTo(250.00);
  }
}
