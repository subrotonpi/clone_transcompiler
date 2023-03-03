public static final long getDay ( ) {
  final String day = input . nextLine ( ) ;
  final SimpleDateFormat dayDt = new SimpleDateFormat ( "yyyy/MM/dd" ) ;
  do {
    final int dayY = Integer . parseInt ( dayDt . format ( day ) ) ;
    final int dayM = Integer . parseInt ( dayDt . format ( day ) ) ;
  }
  while ( true ) ;
  return dayDt . getTime ( ) ;
}
