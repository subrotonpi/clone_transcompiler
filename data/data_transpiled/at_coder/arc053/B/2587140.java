@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > a ) {
  a = new LinkedHashMap < > ( Collections . singletonList ( input . trim ( ) ) ) ;
  int x = 0 ;
  int y = 0 ;
  for ( int i = 0 ;
  i < a . size ( ) ;
  i ++ ) {
    x += a . get ( i ) / 2 ;
    if ( i % 2 == 1 ) y ++ ;
  }
  System . out . println ( y >= 1 ? x / y * 2 + 1 : x * 2 ) ;
}
