package dev.brimming.benefitscalculationrules;

import dev.brimming.Employee;

public class DependentsCostCalculationRule implements BenefitsCostCalculationRule {

  @Override
  public double calculateCosts(Employee employee) {
    return 600 * employee.numOfDependents();
  }
}
