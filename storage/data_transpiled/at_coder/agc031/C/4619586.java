static final int [ ] [ ] solve ( int [ ] input ) {
  System . setOut ( new PrintStream ( System . out ) ) ;
  int n = Integer . parseInt ( input [ 0 ] ) ;
  int a = Integer . parseInt ( input [ 1 ] ) ;
  int b = Integer . parseInt ( input [ 2 ] ) ;
  /* pop the count of the result */
  int res = 0 ;
  for ( int i = 0 ;
  i < 17 ;
  i ++ ) {
    res += ( ( input [ 2 ] [ i ] & 1 ) == 1 ) ? 0 : 1 ;
  }
  if ( ( res ^ ( a ^ b ) ) % 2 == 0 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
    /* if (m == 1) {
    if (x == 0) {
    return [0];
    }
    else {
    return [1];
    }
    }
    */
    int [ ] res = new int [ 2 ] [ ] ;
    res [ 0 ] = x ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      if ( ( input [ 2 ] [ i ] & 1 ) != ( input [ 2 ] [ i ] & 1 ) ) {
        diff = i ;
        break ;
      }
    }
    int s = ( input [ 2 ] [ i ] & 1 ) + ( ( ( input [ 2 ] [ i ] & 1 ) * 2 ) >> 1 ) ;
    int t = ( input [ 2 ] [ i ] & 1 ) + ( ( ( input [ 2 ] [ i ] & 1 ) * 2 ) >> 1 ) ;
    int u = s ^ 1 ;
    int [ ] [ ] left = new int [ m ] [ ] ;
    int [ ] [ ] right = new int [ m ] [ ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      left [ i ] = left [ i ] [ 0 ] ;
      left [ i ] = left [ i ] [ 1 ] ;
      right [ i ] = right [ i ] [ 2 ] ;
    }
    System . out . println ( ( short ) ( n ) + " " + ( short ) ( a ^ b ) ) ;
  }
  return res ;
}
