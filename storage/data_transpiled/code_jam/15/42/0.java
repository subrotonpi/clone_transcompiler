public static int T = Integer . parseInt ( input ) {
  for ( int test = 1 ;
  test <= T ;
  test ++ ) {
    int N = input . nextInt ( ) ;
    int V = input . nextInt ( ) ;
    int X = input . nextInt ( ) ;
    N = Integer . parseInt ( N ) ;
    int goalV = ( int ) ( ( float ) V * 10000 + 0.5 ) ;
    int goalT = ( int ) ( ( float ) X * 10000 + 0.5 ) ;
    int [ ] [ ] vody = new int [ N ] [ N ] ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      vody [ n ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    Arrays . sort ( vody ) ;
    if ( N == 2 && vody [ 0 ] [ 0 ] == vody [ 1 ] [ 0 ] ) {
      N = 1 ;
      vody = Arrays . copyOf ( vody , N ) ;
    }
    if ( vody [ 0 ] [ 0 ] > goalT ) {
      System . out . println ( "Case #" + test + ": IMPOSSIBLE" ) ;
      continue ;
    }
    if ( vody [ vody . length - 1 ] [ 0 ] < goalT ) {
      System . out . println ( "Case #" + test + ": IMPOSSIBLE" ) ;
      continue ;
    }
    if ( vody [ 0 ] [ 0 ] == goalT ) {
      System . out . println ( "Case #" + test + ": " + ( 1. * goalV / vody [ 0 ] [ 1 ] ) ) ;
      continue ;
    }
    if ( vody [ vody . length - 1 ] [ 0 ] == goalT ) {
      System . out . println ( "Case #" + test + ": " + ( 1. * goalV / vody [ vody . length - 1 ] [ 1 ] ) ) ;
      continue ;
    }
    assert N == 2 ;
    assert vody [ 0 ] [ 0 ] < goalT && vody [ 1 ] [ 0 ] < goalT ;
    int p0 = goalT - vody [ 0 ] [ 0 ] ;
    int p1 = vody [ 1 ] [ 0 ] - goalT ;
    float v0 = 1.0f * goalV * p1 / ( p0 + p1 ) ;
    float v1 = 1.0f * goalV * p0 / ( p0 + p1 ) ;
    float t1 = 1.0f * v1 / vo @ @