static final String getExampleName ( ) throws IOException {
  if ( __name__ == "__main__" ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _T = xrange ( T ) ;
    _T < T ;
    _T ++ ) {
      int N = Integer . parseInt ( br . readLine ( ) ) ;
      int C = Integer . parseInt ( br . readLine ( ) ) ;
      int M = Integer . parseInt ( br . readLine ( ) ) ;
      int [ ] bySeat = new int [ N ] ;
      List < List < Integer >> people = new ArrayList < List < Integer >> ( ) ;
      for ( int i = xrange ( C ) ;
      i < N ;
      i ++ ) {
        int p = Integer . parseInt ( br . readLine ( ) ) ;
        int b = Integer . parseInt ( br . readLine ( ) ) ;
        p -- ;
        b -- ;
        bySeat [ p ] ++ ;
        people . get ( b ) . add ( p ) ;
      }
      int r ;
      /* can do this rides */
      int avail = 0 ;
      int promotions = 0 ;
      for ( int i = xrange ( N ) ;
      i < N ;
      i ++ ) {
        int needed = bySeat [ i ] - rides ;
        if ( needed > 0 ) {
          if ( needed > avail ) {
            return - 1 ;
          }
          avail -= needed ;
          promotions += needed ;
        }
        else {
          avail -= needed ;
        }
      }
      return promotions ;
    }
    int ans = 0 ;
    for ( List < Integer > l : people ) {
      ans = Math . max ( ans , l . size ( ) ) ;
    }
    do {
      int r = canDo ( ans ) ;
      if ( r == - 1 ) {
        ans ++ ;
        continue ;
      }
      break ;
    }
    while ( r != - 1 ) ;
    System . out . println ( "Case #" + ( _T + 1 ) + ": " + ans + " " + r ) ;
  }
  return null ;
}
