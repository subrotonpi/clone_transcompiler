public static int N = Integer . parseInt ( input ) {
  TreeSet < Integer > A = new TreeSet < > ( ) ;
  for ( String s : input . split ( " " ) ) {
    A . add ( Integer . parseInt ( s ) ) ;
  }
  /* comb n */
  int res = 1 ;
  for ( int i = n - r + 1 ;
  i <= n ;
  i ++ ) {
    res *= i ;
  }
  for ( int i = 1 ;
  i <= r ;
  i ++ ) {
    res /= i ;
  }
  int x = A . remove ( A . size ( ) - 1 ) ;
  N -- ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A . get ( i ) > x / 2 ) break ;
  }
  if ( Math . abs ( A . get ( i ) - x / 2 ) < Math . abs ( A . get ( i - 1 ) - x / 2 ) ) {
    System . out . println ( x + " " + A . get ( i ) ) ;
  }
  else {
    System . out . println ( x + " " + A . get ( i - 1 ) ) ;
  }
  return x ;
}
