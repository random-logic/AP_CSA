class WSTPrep2A1 {
  public static int numberOfLeapYears (int year1, int year2) {
    int count = 0;
    for (int i = year1; i <= year2; i++) {
      if (isLeapYear(i)) count++;
    }
    return count;
  }

  public static int dayOfWeek (int month, int day, int year) {
    int dayOfYear = dayOfYear(month, day, year), daysAwayFromFirstDay = firstDayOfYear(year) - 1;
    return (dayOfYear + daysAwayFromFirstDay) % 7;
  }
}