static final int [ ] [ ] solve ( int [ ] [ ] x , int [ ] y ) {
  int t = Integer . parseInt ( x [ 0 ] [ 0 ] ) ;
  for ( int i = 1 ;
  i <= t ;
  i ++ ) {
    int k = Integer . parseInt ( x [ i ] [ 0 ] ) ;
    int [ ] s = new int [ 2 * k - 1 ] ;
    for ( int j = 0 ;
    j < s . length ;
    j ++ ) s [ j ] = x [ j ] ;
    int [ ] cR = new int [ 2 * k - 1 ] ;
    for ( int i = ( k - 1 ) ;
    i >= 0 ;
    i -- ) {
      List < Integer > ncR = new LinkedList < Integer > ( ) ;
      int xl = Math . abs ( x [ i ] [ 0 ] ) ;
      int xr = 2 * ( k - 1 ) - Math . abs ( x [ i ] [ 1 ] ) ;
      for ( int j = 0 ;
      j < cR . length ;
      j ++ ) {
        if ( cR [ j ] <= xl || cR [ j ] >= xr ) ncR . add ( cR [ j ] ) ;
        else {
          int u , v ;
          if ( ( i + j + k ) & 1 ) u = j ;
          else v = j ;
          else u = j - 1 ;
          v = j + 1 ;
          boolean fl = true ;
          while ( u >= xl && v <= xr ) {
            if ( s [ i ] [ u ] != s [ i ] [ v ] ) {
              fl = false ;
              break ;
            }
            u -= 2 ;
            v += 2 ;
          }
          if ( fl ) ncR . add ( cR [ j ] ) ;
        }
      }
      cR = ncR . toArray ( new Integer [ ncR . size ( ) ] ) ;
    }
    int [ ] cC = new int [ 2 * k - 1 ] ;
    for ( int i = ( k - 1 ) ;
    i >= 0 ;
    i -- ) {
      List < Integer > ncC = new LinkedList < Integer > ( ) ;
      int xl = Math . abs ( x [ i ] [ 0 ] ) ;
      int xr = 2 * ( k - 1 ) - Math . abs ( x [ i ] [ 1 ] ) ;
      for ( int j = 0 ;
      j < cC . length ;
      j ++ ) {
        if ( cC [ j ] <= xl || cC [ j ] >= xr ) ncC . add (