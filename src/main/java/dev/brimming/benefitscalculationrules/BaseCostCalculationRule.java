package dev.brimming.benefitscalculationrules;

import dev.brimming.Employee;

public class BaseCostCalculationRule implements BenefitsCostCalculationRule {

  @Override
  public double calculateCosts(Employee employee) {
    return 1000.00;
  }
}
