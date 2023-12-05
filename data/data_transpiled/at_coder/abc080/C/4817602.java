public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] F = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) F [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] P = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) P [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int INF = 10 * 9 ;
  int ans = - INF ;
  for ( int i = 1 ;
  i <= 2 * 10 ;
  i ++ ) {
    int tmpans = 0 ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      int c = 0 ;
      for ( int j = 0 ;
      j < 10 ;
      j ++ ) {
        if ( ( i >> j & 1 ) & F [ n ] [ j ] ) {
          c ++ ;
        }
      }
      tmpans += P [ n ] [ c ] ;
    }
    ans = Math . max ( ans , tmpans ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
