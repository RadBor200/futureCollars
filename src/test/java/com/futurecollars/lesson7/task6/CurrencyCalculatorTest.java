package com.futurecollars.lesson7.task6;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;
import java.math.BigDecimal;
import java.util.stream.Stream;

class CurrencyCalculatorTest {

  @ParameterizedTest
  @MethodSource("provideCalculatedBuyingRate")
  void shouldConvertPlnInBuyingRate(BigDecimal expectedAmount, BigDecimal calculatedAmount) {
    Assertions.assertEquals(expectedAmount, calculatedAmount);
  }

  private static Stream<Arguments> provideCalculatedBuyingRate() {
    BigDecimal amountOfPLN = new BigDecimal("20.0");
    ExchangeRate exchangeRateMock = Mockito.mock(ExchangeRate.class);
    CurrencyCalculator currencyCalculator = new CurrencyCalculator(exchangeRateMock);

    Mockito.when(exchangeRateMock.getBuyingRate(Currency.EUR)).thenReturn(new BigDecimal("4.69"));
    Mockito.when(exchangeRateMock.getBuyingRate(Currency.USD)).thenReturn(new BigDecimal("4.72"));
    Mockito.when(exchangeRateMock.getBuyingRate(Currency.GBP)).thenReturn(new BigDecimal("5.46"));

    return Stream.of(
        Arguments.of(new BigDecimal("93.800"), currencyCalculator.calculateBuyingRate(amountOfPLN, Currency.EUR)),
        Arguments.of(new BigDecimal("94.400"), currencyCalculator.calculateBuyingRate(amountOfPLN, Currency.USD)),
        Arguments.of(new BigDecimal("109.200"), currencyCalculator.calculateBuyingRate(amountOfPLN, Currency.GBP))
    );
  }

  @ParameterizedTest
  @MethodSource("provideCalculatedSellingRate")
  void shouldConvertPlnInSellingRate(BigDecimal expectedAmount, BigDecimal calculatedAmount) {
    Assertions.assertEquals(expectedAmount, calculatedAmount);
  }

  private static Stream<Arguments> provideCalculatedSellingRate() {
    BigDecimal amountOfPLN = new BigDecimal("20.0");
    ExchangeRate exchangeRateMock = Mockito.mock(ExchangeRate.class);
    CurrencyCalculator currencyCalculator = new CurrencyCalculator(exchangeRateMock);

    Mockito.when(exchangeRateMock.getSellingRate(Currency.EUR)).thenReturn(new BigDecimal("4.72"));
    Mockito.when(exchangeRateMock.getSellingRate(Currency.USD)).thenReturn(new BigDecimal("4.75"));
    Mockito.when(exchangeRateMock.getSellingRate(Currency.GBP)).thenReturn(new BigDecimal("5.49"));

    return Stream.of(
        Arguments.of(new BigDecimal("94.400"), currencyCalculator.calculateSellingRate(amountOfPLN, Currency.EUR)),
        Arguments.of(new BigDecimal("95.000"), currencyCalculator.calculateSellingRate(amountOfPLN, Currency.USD)),
        Arguments.of(new BigDecimal("109.800"), currencyCalculator.calculateSellingRate(amountOfPLN, Currency.GBP))
    );
  }
}
