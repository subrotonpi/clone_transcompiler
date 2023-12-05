static final int solve ( int t ) {
  int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int p = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int q = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int r = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int s = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int vsota = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int [ ] cum = new int [ n ] ;
  cum [ 0 ] = 0 ;
  for ( int x : l ) {
    cum [ cum . length - 1 ] = cum [ x ] + x ;
  }
  double best = 0.0 ;
  for ( int b = n - 1 ;
  b >= 0 ;
  b -- ) {
    int rem = vsota - ( cum [ n ] - cum [ b ] ) ;
    int al = 0 ;
    int ar = b ;
    while ( al + 1 < ar ) {
      int amid = ( al + ar ) / 2 ;
      int left = cum [ amid ] ;
      int right = cum [ b ] - cum [ amid ] ;
      if ( left > right ) {
        ar = amid ;
      }
      else {
        al = amid ;
      }
    }
    int [ ] s = new int [ 2 ] ;
    s [ 0 ] = cum [ al ] ;
    s [ 1 ] = cum [ b ] - cum [ al ] ;
    s [ 2 ] = cum [ n ] - cum [ b ] ;
    Arrays . sort ( s ) ;
    p = ( s [ 0 ] + s [ 1 ] ) / vsota ;
    best = Math . max ( best , p ) ;
    s = new int [ 2 ] ;
    s [ 0 ] = cum [ ar ] ;
    s [ 1 ] = cum [ b ] - cum [ ar ] ;
    s [ 2 ] = cum [ n ] - cum [ b ] ;
    Arrays . sort ( s ) ;
    p = ( s [ 0 ] + s [ 1 ] ) / vsota ;
    best = Math . max ( best , p ) ;
  }
  for ( int test_case = 1 ;
  test_case <= t ;
  test_case ++ ) {
    n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    p = ( p + 1 )