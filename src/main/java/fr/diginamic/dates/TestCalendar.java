package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2016, 4, 19, 23, 59, 30);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Calendar date(formatted): " + dateFormat.format(calendar.getTime()));

    Calendar today = Calendar.getInstance();
    SimpleDateFormat datetimeFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
    System.out.println("Custom datetime(formatted): " + datetimeFormat.format(today.getTime()));


    SimpleDateFormat franceFormat = new SimpleDateFormat("EEEE MMMM", Locale.FRANCE);
    System.out.println("France Local: " + franceFormat.format(today.getTime()));

    SimpleDateFormat russiaFormat = new SimpleDateFormat("EEEE MMMM", new Locale("ru"));
    System.out.println("Russia Local: " + russiaFormat.format(today.getTime()));

    SimpleDateFormat chinaFormat = new SimpleDateFormat("EEEE MMMM", Locale.CHINA);
    System.out.println("China Local: " + chinaFormat.format(today.getTime()));

    SimpleDateFormat germanFormat = new SimpleDateFormat("EEEE MMMM", Locale.GERMANY);
    System.out.println("Germany Local: " + germanFormat.format(today.getTime()));
  }
}
