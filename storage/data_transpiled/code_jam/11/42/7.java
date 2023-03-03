public static String ok ( int [ ] [ ] a , int r0 , int c0 , int k ) {
  double mr = r0 + k / 2.0 ;
  double mc = c0 + k / 2.0 ;
  double sr = 0 ;
  double sc = 0 ;
  for ( int r : xrange ( r0 , r0 + k ) ) {
    int c1 = r0 < r && r < r0 + k - 1 ? c0 : c0 + 1 ;
    int c2 = r0 < r && r < r0 + k - 1 ? c0 : c0 + k - 1 ;
    for ( int c : xrange ( c1 , c2 ) ) {
      sr += ( r + 0.5 - mr ) * a [ r ] [ c ] ;
      sc += ( c + 0.5 - mc ) * a [ r ] [ c ] ;
    }
  }
  return sr == 0 && sc == 0 ;
}
