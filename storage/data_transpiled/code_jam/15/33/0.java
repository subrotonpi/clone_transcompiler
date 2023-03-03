public static int f2 ( int C , int D , int V , List < Integer > list ) {
  boolean [ ] p = new boolean [ V + 1 ] ;
  p [ 0 ] = true ;
  for ( int i : xrange ( C ) ) {
    for ( int j : list ) {
      for ( int k = xrange ( V , j - 1 , - 1 ) ;
      k > 0 ;
      k -- ) {
        p [ k ] = p [ k ] || p [ k - j ] ;
      }
    }
  }
  int score = 0 ;
  for ( int m : xrange ( V + 1 ) ) {
    if ( ! p [ m ] ) {
      score ++ ;
      for ( int i : xrange ( C ) ) {
        for ( int k = xrange ( V , m - 1 , - 1 ) ;
        k > 0 ;
        k -- ) {
          p [ k ] = p [ k ] || p [ k - m ] ;
        }
      }
    }
  }
  return score ;
}
