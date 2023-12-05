@ VisibleForTesting static String from ( String input ) {
  final String DATE_FORMAT = "yyyy/MM/dd" ;
  Date date = new Date ( input . getBytes ( ) ) ;
  while ( date . getYear ( ) % ( date . getMonth ( ) * date . getDay ( ) ) != 0 ) {
    date . add ( 1 ) ;
  }
  return DATE_FORMAT . format ( date ) ;
}
