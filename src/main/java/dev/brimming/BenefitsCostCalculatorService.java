package dev.brimming;

import com.google.inject.Inject;
import dev.brimming.benefitscalculationrules.BenefitsCostCalculationRule;
import java.util.Set;

public class BenefitsCostCalculatorService {

  private final Set<BenefitsCostCalculationRule> rules;

  @Inject
  public BenefitsCostCalculatorService(Set<BenefitsCostCalculationRule> rules) {
    this.rules = rules;
  }

  public double calculateBenefitsCost(Employee employee) {
    return rules.stream()
        .reduce(0.0, (current, rule) -> current + rule.calculateCosts(employee), Double::sum);
  }
}
