package dev.brimming;

import org.immutables.value.Value.Default;
import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Style;
import org.immutables.value.Value.Style.ImplementationVisibility;

@Immutable
@Style(
    get = {"is*", "get*"},
    init = "set*",
    typeImmutable = "*",
    visibility = ImplementationVisibility.PUBLIC)
public abstract class AbstractEmployee {

  public abstract String firstName();

  public abstract String lastName();

  // public abstract Date dateOfBirth();
  public abstract Double salary();

  @Default
  public Integer numOfDependents() {
    return 0;
  }
}
