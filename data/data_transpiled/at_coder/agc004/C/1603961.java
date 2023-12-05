static final String print ( int i ) {
  int inf = 10 * 20 ;
  double eps = 1.0 / 10 * 10 ;
  int mod = 10 * 9 + 7 ;
  /* LI */
  /* LI_ */
  int [ ] [ ] a = new int [ i ] [ i ] ;
  for ( int j = 0 ;
  j < i ;
  j ++ ) {
    a [ j ] [ 0 ] = i == j ? inf : - inf ;
  }
  /* LF */
  /* LS */
  /* I */
  int [ ] [ ] a = new int [ i ] [ i ] ;
  for ( int j = 0 ;
  j < i ;
  j ++ ) {
    a [ j ] [ 0 ] = i == j ? inf : - inf ;
  }
  /* F */
  /* S */
  input ( ) ;
  /* Main */
  int h = li [ 0 ] [ i ] ;
  int w = li [ 0 ] [ i ] ;
  char [ ] [ ] a = new char [ h ] [ w ] ;
  for ( int j = 1 ;
  j < w ;
  j ++ ) {
    int [ ] a = new int [ j ] ;
    for ( int k = 0 ;
    k < a . length ;
    k ++ ) a [ j ] [ k ] = a [ k ] [ i ] == j ? '#' : - 1 ;
  }
  StringBuilder r = new StringBuilder ( ) ;
  for ( int j = a . length - 1 ;
  j > 0 ;
  j -- ) {
    String t = "" ;
    for ( int k = 0 ;
    k < w ;
    k ++ ) {
      int ci = a [ j ] [ i ] ;
      if ( ci > 0 || i % 2 == 0 ) t += '#' ;
      else t += '.' ;
    }
    r . append ( t ) ;
  }
  return r . toString ( ) ;
}
