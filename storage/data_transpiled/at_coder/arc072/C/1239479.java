public static int [ ] getDistance ( Scanner input ) {
  int N = input . nextInt ( ) ;
  int D = input . nextInt ( ) ;
  int [ ] dv = input . nextInt ( ) ;
  int Q = input . nextInt ( ) ;
  int [ ] qv = input . nextInt ( ) ;
  int distAlice = D ;
  int [ ] distAliceList = new int [ N ] ;
  distAliceList [ 0 ] = D ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( distAlice >= dv [ i ] ) {
      distAlice -= dv [ i ] ;
    }
    else if ( 2 * distAlice >= dv [ i ] ) {
      distAlice = dv [ i ] - distAlice ;
    }
    distAliceList [ i ] = distAlice ;
  }
  int [ ] sol_min = new int [ Q ] ;
  sol_min [ N ] = 1 ;
  int sol_min_ = 1 ;
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    if ( 2 * sol_min_ > dv [ i ] ) {
      sol_min_ += dv [ i ] ;
    }
    sol_min [ N - 1 ] = sol_min_ ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    if ( distAliceList [ qv [ i ] - 1 ] >= sol_min [ N - qv [ i ] ] ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
  return distAlice ;
}
