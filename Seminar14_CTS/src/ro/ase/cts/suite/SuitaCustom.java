package ro.ase.cts.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.categorii.TesteNormale;
import ro.ase.cts.categorii.TesteUrgente;
import ro.ase.cts.teste.TestCaseDummy;
import ro.ase.cts.teste.TestGrupaCuFake;
import ro.ase.cts.teste.TestPromovabilitate;

@RunWith(Categories.class)
@SuiteClasses({TestCaseDummy.class, TestPromovabilitate.class, TestGrupaCuFake.class})
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class})
public class SuitaCustom {

}