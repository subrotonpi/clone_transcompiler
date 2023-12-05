public static int N = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] H = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  double d = 10 * 4 ;
  int n = 0 ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    double dj = Math . abs ( A - ( T - H [ j ] * 0.006 ) ) ;
    if ( dj < d ) {
      d = dj ;
      n = j ;
    }
  }
  System . out . println ( n + 1 ) ;
  return n ;
}
