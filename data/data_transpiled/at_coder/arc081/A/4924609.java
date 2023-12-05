static final String print ( ) {
  final String ns = System . getProperty ( "line.separator" ) ;
  final Function < Integer , Integer > ni = ( ) -> Integer . parseInt ( ns ) ;
  final Function < String , String > nm = ( ) -> Integer . parseInt ( nm ) ;
  final Function < String , List < String >> nl = ( ) -> Collections . singletonList ( nm ) ;
  final Function < String , String > nsl = ( ) -> String . valueOf ( nsl ) ;
  final int n = ni . apply ( n ) ;
  final String a = nl . apply ( n ) ;
  final Counter < String > c = new ClassicCounter < String > ( a ) ;
  final List < Integer > key = new ArrayList < Integer > ( c . keySet ( ) ) ;
  Collections . sort ( key ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < key . size ( ) ;
  i ++ ) {
    if ( c . getCount ( key . get ( i ) ) >= 4 && count != 1 ) {
      System . out . println ( key . get ( i ) * 2 ) ;
      exit ( ) ;
    }
    if ( c . getCount ( key . get ( i ) ) >= 2 ) {
      if ( count == 0 ) {
        a = key . get ( i ) ;
        count ++ ;
      }
      else if ( count == 1 ) {
        b = key . get ( i ) ;
        count ++ ;
      }
    }
    if ( count >= 2 ) {
      System . out . println ( a * b ) ;
      exit ( ) ;
    }
  }
  System . out . println ( 0 ) ;
  return a ;
}
