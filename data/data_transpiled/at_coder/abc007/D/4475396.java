public static int count49 ( String n ) {
  int l = n . length ( ) ;
  int [ ] [ ] [ ] dp = new int [ 2 ] [ l + 1 ] [ l + 1 ] ;
  dp [ 0 ] [ 0 ] [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    int ni = Integer . parseInt ( n . substring ( i , i + 1 ) ) ;
    for ( int less = 0 ;
    less < 2 ;
    less ++ ) {
      int dmax = less > 0 ? 9 : ni ;
      for ( int f49 = 0 ;
      f49 < 2 ;
      f49 ++ ) {
        for ( int d = 0 ;
        d < dmax + 1 ;
        d ++ ) {
          boolean less_ = less || d < ni ;
          boolean f49_ = f49 || d == 4 || d == 9 ;
          dp [ i + 1 ] [ less_ ] [ f49_ ] += dp [ i ] [ less ] [ f49 ] ;
        }
      }
    }
  }
  return ( dp [ l - 1 ] [ 0 ] [ 1 ] + dp [ l - 1 ] [ 1 ] [ 1 ] ) ;
}
