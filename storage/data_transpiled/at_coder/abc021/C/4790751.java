public static int [ ] [ ] createDP ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  double INF = Double . POSITIVE_INFINITY ;
  double MOD = 10 * 9 + 7 ;
  int [ ] [ ] G = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    G [ i ] [ i ] = INF ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ x ] [ y ] = 1 ;
    G [ y ] [ x ] = 1 ;
  }
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        G [ i ] [ j ] = Math . min ( G [ i ] [ j ] , G [ i ] [ k ] + G [ k ] [ j ] ) ;
      }
    }
  }
  int [ ] dp = new int [ n ] ;
  dp [ a ] = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( G [ a ] [ j ] != i ) {
        continue ;
      }
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        if ( G [ a ] [ k ] == i + 1 && G [ j ] [ k ] == 1 ) {
          dp [ k ] = ( dp [ j ] + dp [ k ] ) % MOD ;
        }
      }
    }
  }
  System . out . println ( dp [ b ] ) ;
  return dp ;
}
