static final String print ( int i , int j ) {
  int inf = 10 * 20 ;
  int mod = 10 * 9 + 7 ;
  /* LI */
  /* LI_ */
  for ( i = 0 ;
  i < inf ;
  i ++ ) {
    /* LF */
    for ( j = 0 ;
    j < i ;
    j ++ ) {
      /* LS */
      for ( i = 0 ;
      i < i ;
      i ++ ) {
        /* I */
      }
      /* F */
      for ( j = 0 ;
      j < i ;
      j ++ ) {
        /* S */
        /* */
        int h = i ;
        /* W */
        int w = i + j ;
        boolean [ ] [ ] a = new boolean [ h ] [ w ] ;
        for ( int j = 0 ;
        j < w ;
        j ++ ) {
          a [ j ] [ j ] = false ;
        }
      }
      return a [ i ] ;
    }
  }
  return "" ;
}
