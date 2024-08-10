package dev.brimming;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import dev.brimming.benefitscalculationrules.BaseCostCalculationRule;
import dev.brimming.benefitscalculationrules.BenefitsCostCalculationRule;
import dev.brimming.benefitscalculationrules.DependentsCostCalculationRule;
import dev.brimming.benefitscalculationrules.SalaryGreaterThanEightyThousandCalculationRule;

public class JavaRulesEngineModule extends AbstractModule {

  @Override
  protected void configure() {
    Multibinder<BenefitsCostCalculationRule> ruleBinder =
        Multibinder.newSetBinder(binder(), BenefitsCostCalculationRule.class);
    ruleBinder.addBinding().to(BaseCostCalculationRule.class);
    ruleBinder.addBinding().to(SalaryGreaterThanEightyThousandCalculationRule.class);
    ruleBinder.addBinding().to(DependentsCostCalculationRule.class);
  }
}
