public static boolean safe ( int i , double [ ] xs , double d ) {
  double spare = 1 - d ;
  double X = xs [ i ] + d ;
  for ( int j = 0 ;
  j < xs . length ;
  j ++ ) {
    if ( j != i ) {
      if ( xs [ j ] < X ) {
        spare -= X - xs [ j ] ;
      }
    }
    if ( spare < 0 ) {
      return true ;
    }
  }
  return false ;
}
