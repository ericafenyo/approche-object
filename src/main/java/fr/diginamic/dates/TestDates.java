package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

  public static void main(String[] args) {

    Date today = new Date();
    System.out.println("Today's date : " + today);

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Today's date(formatted): " + dateFormat.format(today));

    System.out.printf("-------------------------------------------------------------------%n");

    Date customDate = new Date(116, 4, 19, 23, 59, 30);
    System.out.println("Custom datetime : " + customDate);
    SimpleDateFormat datetimeFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
    System.out.println("Custom datetime (formatted): " + datetimeFormat.format(customDate));
  }
}
