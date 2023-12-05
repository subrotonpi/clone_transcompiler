public static int W = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] la = new int [ N + 1 ] , lb = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    la [ i ] = a ;
    lb [ i ] = b ;
  }
  int inf = 999999 ;
  int [ ] [ ] dp = new int [ N + 1 ] [ 100 * N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dp [ i ] [ 0 ] = inf ;
  }
  dp [ 0 ] [ 0 ] = 0 ;
  int total = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = la [ i ] , b = lb [ i ] ;
    for ( int j = i + 1 ;
    j >= 0 ;
    j -- ) {
      for ( int v = total + 1 ;
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
