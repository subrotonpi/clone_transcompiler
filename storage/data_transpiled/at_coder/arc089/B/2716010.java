public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] table = new int [ K ] [ K ] ;
  int C = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String x = input . nextLine ( ) ;
    String y = input . nextLine ( ) ;
    String z = input . nextLine ( ) ;
    x = Integer . parseInt ( x ) ;
    y = Integer . parseInt ( y ) ;
    if ( z . equals ( "B" ) ) y += K ;
    x %= ( 2 * K ) ;
    y %= ( 2 * K ) ;
    int t = ( x / K + y / K ) % 2 ;
    x %= K ;
    y %= K ;
    if ( t > 0 ) table [ y ] [ x ] -- ;
    else table [ y ] [ x ] ++ ;
    C ++ ;
  }
  int B = N - C ;
  int [ ] [ ] pr = new int [ K + 1 ] [ K + 1 ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    pr [ i ] [ K ] = 0 ;
  }
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    for ( int j = 0 ;
    j < K ;
    j ++ ) {
      pr [ j ] [ i + 1 ] = pr [ j ] [ i ] + table [ j ] [ i ] ;
    }
  }
  int [ ] [ ] pr2 = new int [ K + 1 ] [ K + 1 ] ;
  for ( int j = 0 ;
  j < K ;
  j ++ ) {
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      pr2 [ j + 1 ] [ i + 1 ] = pr2 [ j ] [ i + 1 ] + pr [ j ] [ i + 1 ] ;
    }
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < K + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < K + 1 ;
    j ++ ) {
      int s = pr2 [ i ] [ K ] + pr2 [ K ] [ j ] - 2 * pr2 [ i ] [ j ] ;
      ans = Math . max ( ans , C - s , B + s ) ;
    }
  }
  System . out . println ( ans ) ;
  return C ;
}
