static final String solve ( ) {
  final double INF = Double . POSITIVE_INFINITY ;
  @ SuppressWarnings ( "unused" ) final double hight = 2 * ( n + 2 ) - 3 ;
  @ SuppressWarnings ( "unused" ) final double paty = 2 * ( n + 1 ) - 1 ;
  @ SuppressWarnings ( "unused" ) final int rec = ( n , x ) -> {
    if ( n == 0 ) {
      if ( x == 0 ) {
        return 0 ;
      }
      else {
        return 1 ;
      }
    }
    if ( x == 0 ) {
      return 0 ;
    }
    else if ( x == 1 ) {
      return 0 ;
    }
    else if ( x < hight ( n - 1 ) + 2 ) {
      return rec ++ ;
    }
    else if ( x == hight ( n - 1 ) + 2 ) {
      return paty ++ ;
    }
    else {
      return paty ++ ;
    }
  }
  ;
  @ SuppressWarnings ( "unused" ) final int N = Integer . parseInt ( "inf" ) ;
  @ SuppressWarnings ( "unused" ) final int X = Integer . parseInt ( "inf" ) ;
  @ SuppressWarnings ( "unused" ) final int [ ] tokens = new int [ N ] ;
  {
    int N = Integer . parseInt ( "" ) ;
    int X = Integer . parseInt ( "" ) ;
    solve ( N , X ) ;
  }
  @ SuppressWarnings ( "unused" ) final int N = Integer . parseInt ( "inf" ) ;
  @ SuppressWarnings ( "unused" ) final int X = Integer . parseInt ( "" ) ;
  @ SuppressWarnings ( "unused" ) final int [ ] tokens = new int [ N ] ;
  {
    int N = Integer . parseInt ( "" ) ;
    int X = Integer . parseInt ( "" ) ;
    solve ( N , X ) ;
  }
}
