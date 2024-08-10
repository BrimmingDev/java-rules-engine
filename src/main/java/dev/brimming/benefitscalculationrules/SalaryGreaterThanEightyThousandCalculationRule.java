package dev.brimming.benefitscalculationrules;

import dev.brimming.Employee;

public class SalaryGreaterThanEightyThousandCalculationRule implements BenefitsCostCalculationRule {

  @Override
  public double calculateCosts(Employee employee) {
    if (employee.salary() < 80000) {
      return 0.0;
    }

    return (double) Math.round(employee.salary() * .02) / 100;
  }
}
