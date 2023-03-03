static final double [ ] [ ] range ( int i , int j ) {
  int inf = i + j ;
  int mod = i + j ;
  /* LI */
  int [ ] [ ] a = new int [ 4 ] [ 4 ] ;
  /* LI_ */
  for ( i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] [ j ] = Integer . parseInt ( a [ i ] [ j ] ) ;
  }
  /* LF */
  for ( i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] [ j ] = Float . parseFloat ( a [ i ] [ j ] ) ;
  }
  /* LS */
  for ( i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] [ j ] = Integer . parseInt ( a [ i ] [ j ] ) ;
  }
  /* I */
  for ( i = 0 ;
  i < a . length ;
  i ++ ) {
    /* F */
    for ( j = 0 ;
    j < a [ i ] . length ;
    j ++ ) {
      /* S */
      a [ i ] [ j ] = Integer . parseInt ( a [ i ] [ j ] ) ;
    }
  }
  /* main */
  return a ;
}
