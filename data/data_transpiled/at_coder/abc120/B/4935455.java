public static void print ( String [ ] m ) {
  m = list ( map ( input ) ) ;
  int a = m [ 0 ] ;
  int b = m [ 1 ] ;
  int k = m [ 2 ] ;
  int c = Math . min ( a , b ) ;
  int d = 0 ;
  int e = 0 ;
  for ( int i = 0 ;
  i < c ;
  i ++ ) {
    if ( ( a % ( c - i ) == 0 ) && ( b % ( c - i ) == 0 ) ) {
      d ++ ;
    }
    if ( ( d == k ) ) {
      e = c - i ;
      break ;
    }
  }
  System . out . println ( e ) ;
}
