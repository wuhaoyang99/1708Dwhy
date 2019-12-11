package com.bawei.day;

import org.junit.Test;

public class DateDemo {
  @Test
  public void test01() {
    //调用DateUtil方法
    long years = DateUtils.getYears("1990-12-11");
    System.out.println(years);
  }

  @Test
  //注解
  public void test02() {
    long days = DateUtils.getDaysByDeparted("2020-12-11");
    System.out.println(days);
  }

  @Test
  public void test03() {
    String date = DateUtils.getDateByMonthInit("2020-12-11");
    System.err.println(date);
  }

  @Test
  public void test04() {
    String endOfDay = DateUtils.getEndOfDay("2020-12-11");
    System.out.println(endOfDay);
  }
}
