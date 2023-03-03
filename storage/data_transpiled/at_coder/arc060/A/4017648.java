public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Math . max ( Math . max ( x [ i ] , A ) , N ) ;
  int [ ] [ ] dp = new int [ 2 * N * X + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int tmp = x [ i ] - A ;
    y [ i ] = tmp ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 * N * X + 1 ;
    j ++ ) {
      if ( j - y [ i ] < 0 || j - y [ i ] > 2 * N * X ) dp [ i + 1 ] [ j ] = dp [ i ] [ j ] ;
      else dp [ i + 1 ] [ j ] = dp [ i ] [ j ] + dp [ i ] [ j - y [ i ] ] ;
    }
  }
  System . out . println ( dp [ N ] [ N * X ] - 1 ) ;
}
