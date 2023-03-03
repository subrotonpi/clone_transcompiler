public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] xy = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    xy [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < N ;
      k ++ ) {
        int t = ( xy [ j ] [ 0 ] - xy [ i ] [ 0 ] ) * ( xy [ k ] [ 1 ] - xy [ i ] [ 1 ] ) - ( xy [ j ] [ 1 ] - xy [ i ] [ 1 ] ) * ( xy [ k ] [ 0 ] - xy [ i ] [ 0 ] ) ;
        if ( t % 2 == 0 && t != 0 ) ans ++ ;
      }
    }
  }
  return ans ;
}
