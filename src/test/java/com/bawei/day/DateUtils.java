package com.bawei.day;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * LocalDate ���� LocalTime ʱ�� LocalDateTime ���ں�ʱ��
 * 
 */
public class DateUtils {
  /**
   */
  public static String getDateByMonthInit(String date) {
    // ÿ�µ����һ��
    LocalDate monthOfLastDate = LocalDate.parse(date).with(TemporalAdjusters.firstDayOfMonth());
    return monthOfLastDate.toString() + " "
      + LocalDateTime.MIN.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
  }

  /**
   *  ���ĳ�����ʱ�� 2017-10-15 23:59:59
   * @param date
   * @return
   */
  public static String getEndOfDay(String date) {
    // ÿ�µ����һ��
    LocalDate monthOfLastDate = LocalDate.parse(date).with(TemporalAdjusters.lastDayOfMonth());
    return monthOfLastDate.toString() + " "
      + LocalDateTime.MAX.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
  }

  /**
   * ���ݴ���Ĳ�����ȡ����������ĩ���ڣ��������������Ϊ��2019-09-19 19:29:39�������ء�2019-09-30
   * 23:59:59����ע���´���С�Լ����ꡣ
   * 
   * @return
   */
  public static String getDateByMonthLast(String date) {
    // ÿ�µ����һ��
    LocalDate monthOfLastDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"))
      .with(TemporalAdjusters.lastDayOfMonth());
    return monthOfLastDate.toString() + " "
      + LocalDateTime.MAX.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
  }

  /**
   * ���ݴ�������ڻ�ȡ����yyyy-MM-dd
   * 
   * @param date
   * @return
   */
  public static long getYears(String date) {// 1990-12-11
    // ��ȡ��ǰϵͳʱ��
    LocalDate today = LocalDate.now();// 2019-12-11
    LocalDate playerDate = LocalDate.parse(date);// yyyy-MM-dd
    long years = ChronoUnit.YEARS.between(playerDate, today);
    return years;
  }

  /**
   * ���ȥ����������ȥ������(��δ����������컹ʣ������)
   */
  public static long getDaysByDeparted(String departed) {
    // ��ȡ��ǰϵͳʱ��
    LocalDate today = LocalDate.now();
    //
    LocalDate birthDate = LocalDate.parse(departed);
    System.out.println("相差" + ChronoUnit.DAYS.between(birthDate, today));
    System.out.println("相差" + Math.abs(ChronoUnit.DAYS.between(birthDate, today)));
    long days = Math.abs(ChronoUnit.DAYS.between(birthDate, today));
    return days;
  }
}
