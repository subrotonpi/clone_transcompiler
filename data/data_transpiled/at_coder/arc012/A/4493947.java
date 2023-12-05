public static int day ( ) {
  int day = input ( ) ;
  return ( day == "Sunday" ? 0 : [ "Saturday" , "Friday" , "Thursday" , "Wednesday" , "Tuesday" , "Monday" ] . indexOf ( day ) ) ;
}
