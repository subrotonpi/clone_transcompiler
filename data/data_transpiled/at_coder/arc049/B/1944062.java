static int N = Integer . parseInt ( input ) {
  int [ ] [ ] src = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    src [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int INF = 10 * 9 ;
  {
    int l = 0 ;
    int b = - INF ;
    int r = 0 ;
    int t = INF ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int x = src [ i ] [ 0 ] ;
      int y = src [ i ] [ 1 ] ;
      int c = src [ i ] [ 2 ] ;
      l = Math . max ( l , x - time / c ) ;
      r = Math . min ( r , x + time / c ) ;
      if ( l > r ) return false ;
      b = Math . max ( b , y - time / c ) ;
      t = Math . min ( t , y + time / c ) ;
      if ( b > t ) return false ;
    }
  }
}
