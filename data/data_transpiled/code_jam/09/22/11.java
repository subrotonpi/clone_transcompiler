@ Sys public static int findLeast ( String s , int p , int x ) {
  int m = 0 ;
  int b = s . length ( ) ;
  for ( int i : xrange ( p , s . length ( ) ) ) {
    if ( s . charAt ( i ) > x && ( m == 0 || s . charAt ( i ) < m ) ) {
      m = s . charAt ( i ) ;
      b = i ;
    }
  }
  return b ;
}
