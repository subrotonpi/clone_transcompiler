public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  a -- ;
  b -- ;
  final double INF = Double . POSITIVE_INFINITY ;
  double [ ] [ ] mat = new double [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    mat [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    mat [ x - 1 ] [ y - 1 ] = 1 ;
    mat [ y - 1 ] [ x - 1 ] = 1 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        mat [ j ] [ k ] = Math . min ( mat [ j ] [ k ] , mat [ j ] [ i ] + mat [ i ] [ k ] ) ;
      }
    }
  }
  int mod = 10 * 9 + 7 ;
  double [ ] num = new double [ n ] ;
  num [ a ] = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( mat [ a ] [ j ] != i ) {
        continue ;
        for ( int k = 0 ;
        k < n ;
        k ++ ) {
          if ( mat [ a ] [ k ] == i + 1 && mat [ j ] [ k ] == 1 ) {
            num [ k ] += num [ j ] ;
            num [ k ] %= mod ;
          }
        }
      }
    }
  }
  System . out . println ( num [ b ] ) ;
}
