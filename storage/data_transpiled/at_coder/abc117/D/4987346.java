public static String solve ( String string ) {
  int n = Integer . parseInt ( string ) ;
  int k = Integer . parseInt ( string ) ;
  String ... a = string . split ( " " ) ;
  int x ;
  if ( k == 0 ) {
    x = 0 ;
  }
  else {
    int l = k + "" . length ( ) ;
    int [ ] base = new int [ l ] ;
    for ( int i = 0 ;
    i < l ;
    i ++ ) {
      base [ i ] = 2 * ( l - i - 1 ) ;
    }
    int [ ] count = new int [ l ] ;
    for ( String _a : a ) {
      String tmp = _a + "" ;
      for ( int i = tmp . length ( ) - 1 ;
      i >= 0 ;
      i -- ) {
        String _f = tmp . substring ( i , i + 1 ) ;
        if ( i >= l ) break ;
        if ( _f . equals ( "1" ) ) count [ l - i - 1 ] ++ ;
      }
    }
    x = 0 ;
    for ( int _c = 0 ;
    _c < count . length ;
    _c ++ ) {
      int _b = base [ _c ] ;
      if ( _c < n / 2 && x + _b <= k ) x += _b ;
    }
  }
  return String . valueOf ( Integer . valueOf ( x ) ^ a [ 0 ] ) ;
}
