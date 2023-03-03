public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  List < List < Integer >> WP = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) WP . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  int MIN = 0 ;
  int MAX = 100 ;
  while ( MAX - MIN > 10 * ( - 8 ) ) {
    int x = ( MAX + MIN ) / 2 ;
    List < Integer > NEEDLIST = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) NEEDLIST . add ( WP . get ( i ) . get ( 0 ) * x - WP . get ( i ) . get ( 1 ) * WP . get ( 2 ) ) ;
    NEEDLIST . sort ( ) ;
    if ( Arrays . binarySearch ( NEEDLIST , 0 , K ) >= 0 ) MAX = x ;
    else MIN = x ;
  }
  System . out . println ( ( MAX + MIN ) / 2 ) ;
}
