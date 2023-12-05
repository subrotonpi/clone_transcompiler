static final double [ ] [ ] range ( int i , int j ) {
  final double inf = 10 * 20 ;
  final double gosa = 1.0 / 10 * 10 ;
  final int mod = 10 * 9 + 7 ;
  /* LI */
  final int [ ] [ ] a = new int [ i ] [ j ] ;
  /* LI_ */
  final int [ ] [ ] LI_ = new int [ i ] [ j ] ;
  /* LF */
  for ( int j = 0 ;
  j < i ;
  j ++ ) LI_ [ j ] [ j ] = Integer . MAX_VALUE - 1 ;
  /* LS */
  for ( int j = 0 ;
  j < i ;
  j ++ ) LI_ [ j ] [ j ] = Integer . MAX_VALUE ;
  /* I */
  for ( int j = 0 ;
  j < i ;
  j ++ ) LI_ [ j ] [ j ] = Integer . MAX_VALUE ;
  /* F */
  for ( int j = 0 ;
  j < i ;
  j ++ ) LI_ [ j ] [ j ] = Double . MAX_VALUE ;
  /* S */
  final double [ ] [ ] a = new double [ i ] [ j ] ;
  /* Distance */
  for ( int j = 0 ;
  j < i ;
  j ++ ) {
    a [ j ] = LI_ [ j ] [ j ] ;
  }
  /* Radian */
  for ( int j = 0 ;
  j < i ;
  j ++ ) {
    a [ j ] [ j ] = Math . atan2 ( y2 - y1 , x2 - x1 ) ;
  }
  /* Drx */
  for ( int j = 0 ;
  j < i ;
  j ++ ) {
    a [ j ] [ j ] = Math . cos ( j ) * j ;
  }
  /* dry */
  for ( int j = 0 ;
  j < i ;
  j ++ ) {
    a [ j ] [ j ] = Math . sin ( j ) * j ;
  }
  /* Main */
  final double x = li [ i ] [ j ] ;
  final double y = li [ i ] [ j ] ;
  final int n = i ;
  final int [ ] a = new int [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) a [ j ] = li [ i ] [ j ] ;
  double r = inf ;
  for ( int j = 0 ;
  j < i ;
  j ++ ) {
    a [ j ] [ j ] = Math . sin ( j ) * j ;
  }
  