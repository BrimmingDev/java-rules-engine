package dev.brimming;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new JavaRulesEngineModule());
    BenefitsCostCalculatorService benefitsCostCalculatorService =
        injector.getInstance(BenefitsCostCalculatorService.class);

    Employee employee =
        Employee.builder()
            .setFirstName("John")
            .setLastName("Doe")
            .setSalary(100000.00)
            .setNumOfDependents(4)
            .build();

    System.out.println(benefitsCostCalculatorService.calculateBenefitsCost(employee));
  }
}
