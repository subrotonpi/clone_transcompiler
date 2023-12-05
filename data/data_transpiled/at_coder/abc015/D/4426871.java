public static int W = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N + 1 ] , B = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ i ] = a ;
    B [ i ] = b ;
  }
  float inf = Float . POSITIVE_INFINITY ;
  float [ ] [ ] dp = new float [ 100 * N + 1 ] [ N + 1 ] ;
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
    int a = A [ i ] , b = B [ i ] ;
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
  int res = 0 ;
  for ( int i = 1 ;
  i <= K ;
  i ++ ) {
    for ( int j = 0 ;
    j < 100 * N + 1 ;
    j ++ ) {
      if ( dp [ i ] [ j ] <= W ) {
        res = Math . max ( res , j ) ;
      }
    }
  }
  System . out . println ( res ) ;
  return res ;
}
