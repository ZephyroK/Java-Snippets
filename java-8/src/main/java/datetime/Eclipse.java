import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

public class Eclipse {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
	LocalTime nowTime = LocalTime.now();
	LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
	System.out.println("It's currently " + nowDateTime + " where I am");

	// The day of the eclipse in Madras
	LocalDate eclipseDate1 = LocalDate.of(2017, 8, 21);
	LocalDate eclipseDate2 = LocalDate.parse("2017-08-21");
	System.out.println("Eclipse date: " + eclipseDate1 + ", " + eclipseDate2);

	// Eclipse begins in Madras
	LocalTime begins = LocalTime.of(9, 6, 43);         // 09:06:43
	// Totality starts in Madras
	LocalTime totality = LocalTime.parse("10:19:36");  // 10:19:36
	System.out.println("Eclipse begins at " + begins + " and totality is at " + totality);

	String eclipseDateTime = "2017-08-21 10:19";
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	LocalDateTime eclipseDay = LocalDateTime.parse(eclipseDateTime, formatter); // use formatter
	System.out.println("Eclipse day: " + eclipseDay);

	System.out.println("Eclipse day, formatted: " + eclipseDay.format(DateTimeFormatter.ofPattern("dd, mm, yy hh, mm")));
	System.out.println("Mom time: " + eclipseDay.plusHours(2));
	System.out.println("Going home:" + eclipseDay.plusDays(3));
	System.out.println("What day of the week is eclipse? " + eclipseDay.getDayOfWeek());

	ZonedDateTime zTotalityDateTime = ZonedDateTime.of(eclipseDay, ZoneId.of("US/Pacific"));
	System.out.println("Date and time totality begins with time zone: " + zTotalityDateTime);

	ZoneId pacific = ZoneId.of("US/Pacific");
	System.out.println("Is Daylight Savings in effect at the time of totality: "
		       	+ pacific.getRules().isDaylightSavings(zTotalityDateTime.toInstant()));

	ZonedDateTime followingThursdayDateTime =
		zTotalityDateTime.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
	System.out.println("Thursday following the totality: " + followingThursdayDateTime);

	// Totality begins in Austin, TX in 2024 at 1:35pm and 56 seconds
	// Specify year, month, dayOfMonth, hour, minute, second, nano, zone
	ZonedDateTime totalityAustin = ZonedDateTime.of(2024, 4, 8, 13, 35, 56, 0, ZoneId.of("US/Central"));
	System.out.println("Next total eclipse in the US, date/time in Austin, TX: " + totalityAustin);

	// Reminder for a month before
	Period period = Period.ofMonths(1);
	System.out.println("Period is " + period);
	ZonedDateTime reminder = totalityAustin.minus(period);
	System.out.println("DateTime of 1 month reminder: " + reminder);

	System.out.println("Local DateTime (Austin, TX) of reminder: " + reminder.toLocalDateTime());
	System.out.println("Zoned DateTime (Madras, OR) of reminder: " + reminder.withZoneSameInstant(ZoneId.of("US/Pacific")));

	// Eclipse begins in Austin, TX
	LocalTime beginsEclipse = LocalTime.of(12, 17, 32);   // 12:17:32
	// Totality in Austin, TX
	LocalTime totalEclipse = LocalTime.of(13, 35, 56); // 13:35:56
	System.out.println("Eclipse begins at " + beginsEclipse + " and totality is at " + totalEclipse);

	// How many minutes between when the eclipse begins and totality?
	long betweenMins = ChronoUnit.MINUTES.between(beginsEclipse, totalEclipse);
	System.out.println("Minutes between begin and totality: " + betweenMins);

	Duration betweenDuration = Duration.ofMinutes(betweenMins);
	System.out.println("Duration: " + betweenDuration);

	LocalTime totalityBegins = beginsEclipse.plus(betweenDuration);
	System.out.println("Totality begins, computed; " + totalityBegins);

	ZonedDateTime totalityAustin =
		ZonedDateTime.of(2024, 4, 8, 13, 35, 56, 0, ZoneId.of("US/Central"));
	Instant totalityInstant = totalityAustin.toInstant();
	System.out.println("Austin's eclipse instant is: " + totalityInstant);
    }
}
