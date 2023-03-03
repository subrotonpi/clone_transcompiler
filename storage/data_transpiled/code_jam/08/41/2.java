static final int solve ( int [ ] vals , int ind ) {
  switch ( vals [ ind - 1 ] ) {
    case 0 : return - 1 ;
    case 1 : return 0 ;
    default : int a = solve ( vals , ind * 2 ) ;
    int b = solve ( vals , ind * 2 + 1 ) ;
    if ( a == - 1 && b == - 1 ) {
      return - 1 ;
    }
    else if ( a == - 1 || b == - 1 ) {
      if ( b == - 1 ) {
        b = a ;
      }
      if ( vals [ ind - 1 ] % 100 == 10 ) {
        return b ;
      }
      else if ( vals [ ind - 1 ] / 100 == 1 ) {
        return b + 1 ;
      }
      else {
        return - 1 ;
      }
    }
    else {
      if ( vals [ ind - 1 ] % 100 == 10 ) {
        return Math . min ( a , b ) ;
      }
      else if ( vals [ ind - 1 ] / 100 == 1 ) {
        return Math . min ( Math . min ( a , b ) + 1 , a + b ) ;
      }
      else {
        return a + b ;
      }
    }
  }
  /* do something */
  String [ ] line = new String ( ) . split ( "\\s+" ) ;
  int M = Integer . parseInt ( line [ 0 ] ) ;
  int V = Integer . parseInt ( line [ 1 ] ) ;
  int [ ] vals = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    if ( i < ( M - 1 ) / 2 ) {
      line = new String ( ) . split ( "\\s+" ) ;
      int x = Integer . parseInt ( line [ 0 ] ) ;
      int C = Integer . parseInt ( line [ 1 ] ) ;
      if ( V == 0 ) x = 1 - x ;
      vals [ i ] = x + 10 + 100 * C ;
    }
    else {
      int x = Integer . parseInt ( line [ 0 ] ) ;
      if ( V == 0 ) x = 1 - x ;
      vals [ i ] = x ;
    }
  }
  int s = solve ( vals , 1 ) ;
  if ( s == - 1 ) {
    return "IMPOSSIBLE" ;
  }
  /* do something */
  System . out . println ( s ) ;
}
