public static double T = Integer . parseInt ( readLine ( ) ) {
  int T = Integer . parseInt ( readLine ( ) ) ;
  {
    int c = 0 ;
    int s = 0 ;
    for ( int j : xrange ( a [ i ] . length ) ) {
      if ( a [ i ] [ j ] != - 1 ) {
        c ++ ;
        if ( a [ i ] [ j ] == 1 ) s ++ ;
      }
    }
    return ( double ) s / ( double ) c ;
  }
  {
    int cc = 0 ;
    int ss = 0 ;
    for ( int j : xrange ( a [ i ] . length ) ) {
      if ( a [ i ] [ j ] != - 1 ) {
        c = 0 ;
        int s = 0 ;
        for ( int k : xrange ( a [ j ] . length ) ) {
          if ( a [ j ] [ k ] != - 1 && k != i ) {
            c ++ ;
            if ( a [ j ] [ k ] == 1 ) s ++ ;
          }
        }
      }
      ss += ( double ) s / ( double ) c ;
      cc ++ ;
    }
    return ( double ) ss / ( double ) cc ;
  }
  {
    double res = 0.25 * WP ( a , i ) + 0.5 * OWP ( a , i ) ;
    int oowp = 0 ;
    int cOwp = 0 ;
    for ( int j : xrange ( a [ i ] . length ) ) {
      if ( a [ i ] [ j ] != - 1 ) {
        cOwp ++ ;
        oowp += OWP ( a , j ) ;
      }
    }
    return res + 0.25 * ( oowp / cOwp ) ;
  }
}
