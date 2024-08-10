package dev.brimming.benefitscalculationrules;

import dev.brimming.Employee;

public interface BenefitsCostCalculationRule {
  double calculateCosts(Employee employee);
}
