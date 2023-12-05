static final String [ ] [ ] getStrings ( ) {
  int inf = 10 * 20 ;
  int mod = 10 * 9 + 7 ;
  int [ ] [ ] b = new int [ 19 ] [ 19 ] ;
  int tc = 1 ;
  for ( int i = 0 ;
  i < 19 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 19 ;
    j ++ ) {
      if ( b [ i ] [ j ] != 'x' ) continue ;
      b [ i ] [ j ] = '.' ;
      if ( ff ( b ) == true ) return "YES" ;
      b [ i ] [ j ] = 'x' ;
      tc ++ ;
    }
  }
  int [ ] [ ] f = new int [ 19 ] [ 19 ] ;
  for ( int i = 0 ;
  i < 19 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 19 ;
    j ++ ) {
      if ( f [ i ] [ j ] != 'x' ) continue ;
      int t = b [ i ] [ j ] ;
      tc = 1 ;
      for ( int k = j + 1 ;
      k < 19 ;
      k ++ ) {
        if ( b [ i ] [ j ] != '.' ) continue ;
        b [ i ] [ j ] = 'x' ;
        tc ++ ;
      }
    }
  }
  System . out . println ( new String [ 19 ] [ 19 ] ) ;
  return b ;
}
