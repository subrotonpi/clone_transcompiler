public static double N = Integer . parseInt ( input ) {
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( int way = 1 ;
  way <= - 1 ;
  ) {
    int b = 1 ;
    int t = a [ 0 ] ;
    for ( int aa : a ) {
      if ( way == 1 ) {
        if ( aa < t ) {
          b ++ ;
          way = 0 ;
        }
      }
      else if ( way == - 1 ) {
        if ( aa > t ) {
          b ++ ;
          way = 0 ;
        }
      }
      else {
        if ( aa < t ) {
          way = - 1 ;
        }
        else if ( aa == t ) {
          way = 0 ;
        }
        else {
          way = 1 ;
        }
      }
      t = aa ;
    }
    ans = Math . min ( ans , b ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
