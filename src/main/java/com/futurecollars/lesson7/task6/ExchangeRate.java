package com.futurecollars.lesson7.task6;

import java.math.BigDecimal;

public interface ExchangeRate {

  BigDecimal getBuyingRate(Currency currency);
  BigDecimal getSellingRate(Currency currency);

}
