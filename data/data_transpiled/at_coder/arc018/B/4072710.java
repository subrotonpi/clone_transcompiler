@ Test public static void bLatticePointAndInteger ( int N , int [ ] [ ] Pos ) {
  /* Compute the surface of the given number of points */
  double xb = Xb - Xa , yb = Yb - Ya ;
  double xc = Xc - Xa , yc = Yc - Ya ;
  double ret = Math . abs ( xb * yc - yb * xc ) ;
  int ans = 0 ;
  for ( int i = 0 , j = 0 , k = 0 ;
  i < N ;
  i += 3 , j += 3 , k += 3 ) {
    int s = surface2 ( ( int ) Pos [ i ] [ j ] , ( int ) Pos [ k ] ) ;
    if ( s != 0 && s % 2 == 0 ) ans ++ ;
  }
}
