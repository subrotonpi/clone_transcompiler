static final double [ ] [ ] range ( int i , int j ) {
  int inf = i * i ;
  int mod = i * i + 1 ;
  /* LI */
  /* LI_ */
  /* LF */
  /* LS */
  /* I */
  int [ ] [ ] d = new int [ 4 ] [ 4 ] ;
  /* F */
  /* S */
  /* S */
  int n = i ;
  int [ ] [ ] a = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    int j = 1 ;
    double [ ] t = new double [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int i2 = d [ j ] * 2 ;
      while ( j < n && d [ j ] < i2 ) {
        j ++ ;
      }
      if ( j == n ) {
        break ;
      }
      t [ j ] += a [ i ] ;
    }
    for ( int j = 1 ;
    j < n ;
    j ++ ) {
      t [ j ] += t [ i - 1 ] ;
    }
    a = t ;
  }
  return Arrays . copyOf ( a , n ) % mod ;
}
