package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vacation.csv")
    public void shouldCalcExact(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }



 //   @Test
 //   public void shouldCalcExact() {
   //     VacationService service = new VacationService();
     //   int expected = 3;
       // int actual = service.calculate(10000, 3000, 20000);

        //Assertions.assertEquals(expected, actual);
   // }
    //@Test
    //public void shouldCalcExact2() {
      //  VacationService service = new VacationService();
        //int expected = 2;
        //int actual = service.calculate(100_000, 60_000, 150_000);

        //Assertions.assertEquals(expected, actual);
   // }
}
