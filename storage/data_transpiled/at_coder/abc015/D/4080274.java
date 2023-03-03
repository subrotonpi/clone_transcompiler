public static int W = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] AB = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) AB [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] dp = new int [ 100 * N + 1 ] [ N + 1 ] ;
  dp [ 0 ] [ 0 ] = 0 ;
  int total = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = AB [ i ] ;
    int b = AB [ i ] ;
    for ( int j = i ;
    j >= 0 ;
    j -- ) {
      for ( int v = total ;
      v >= 0 ;
      v -- ) {
        dp [ j + 1 ] [ v + b ] = Math . min ( dp [ j + 1 ] [ v + b ] , dp [ j ] [ v ] + a ) ;
      }
    }
    total += b ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= K ;
  i ++ ) {
    for ( int j = 0 ;
    j < 100 * N + 1 ;
    j ++ ) {
      if ( dp [ i ] [ j ] <= W ) ans = Math . max ( ans , j ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
