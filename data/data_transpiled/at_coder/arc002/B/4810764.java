@ BeforeClass public static void main ( ) {
  final String ymd = input ( ) ;
  final SimpleDateFormat formatter = new SimpleDateFormat ( "yyyy/MM/dd" ) ;
  final Calendar currentDate = Calendar . getInstance ( ) ;
  do {
    final int year = currentDate . get ( Calendar . YEAR ) ;
    final int month = currentDate . get ( Calendar . MONTH ) ;
    final int day = currentDate . get ( Calendar . DAY_OF_MONTH ) ;
    final String candidate = formatter . format ( currentDate . getTime ( ) ) ;
    if ( year % ( month * day ) == 0 && candidate . compareTo ( ymd ) >= 0 ) {
      System . out . println ( candidate ) ;
      exit ( ) ;
    }
    currentDate . add ( Calendar . DATE , 1 ) ;
  }
  while ( currentDate . getTime ( ) != null ) ;
  if ( className . equals ( "java.util.Date" ) ) {
    new Date ( ) ;
  }
}
