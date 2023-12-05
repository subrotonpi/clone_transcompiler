@ VisibleForTesting static int from ( Scanner in ) {
  int T = in . nextInt ( ) ;
  int r , t ;
  for ( int z = 1 ;
  z <= T ;
  z ++ ) {
    r = in . nextInt ( ) ;
    t = in . nextInt ( ) ;
    int lo = 0 ;
    int hi = 2 * 64 ;
    while ( hi - lo > 1 ) {
      int mid = ( int ) ( ( hi + lo ) / 2 ) ;
      int val = in . nextInt ( ) ;
      if ( val < t ) {
        lo = mid ;
      }
      else if ( val > t ) {
        hi = mid ;
      }
      else {
        hi = mid ;
        lo = mid ;
        break ;
      }
    }
    int ans = 0 ;
    if ( in . nextInt ( ) > t ) {
      ans = lo ;
    }
    else {
      ans = hi ;
    }
    System . out . println ( "Case #" + z + ": " + ans ) ;
  }
  return ( r + t ) ;
}
