package ro.ase.cts.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.teste.TestCaseDummy;
import ro.ase.cts.teste.TestGrupaCuFake;
import ro.ase.cts.teste.TestPromovabilitate;

@RunWith(Suite.class)
@SuiteClasses({TestCaseDummy.class, TestPromovabilitate.class, TestGrupaCuFake.class})
public class SuitaCompleta {

}