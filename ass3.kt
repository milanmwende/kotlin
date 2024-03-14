import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime
import java.time.Month


fun main(
){
  var clock = LocalTime.now()
   var date = LocalDate.now()
   var day =date.dayOfWeek
   var month =date.month
   var year =date.year

   println(clock)
   println(day)
   println(date)
   println(month)
   println(year)
}
