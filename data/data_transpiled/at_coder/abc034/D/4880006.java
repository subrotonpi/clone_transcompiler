public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , k = Integer . parseInt ( input ) ;
  List < List < Integer >> a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  int d = 100 ;
  int e = 0 ;
  while ( d - e > 10 * 10 - 8 ) {
    int h = ( d + e ) / 2 ;
    List < Integer > c = new ArrayList < > ( ) ;
    for ( int w = 0 ;
    w < p ;
    w ++ ) {
      c . add ( w * ( p - h ) * 10 * ( - 2 ) ) ;
    }
    if ( Integer . parseInt ( c . get ( 0 ) ) >= k ) {
      e = h ;
    }
    else {
      d = h ;
    }
  }
  System . out . println ( e ) ;
}
