@ VisibleForTesting static int [ ] [ ] solve ( ) throws IOException {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  for ( int t = 1 ;
  t <= Integer . MAX_VALUE ;
  t ++ ) {
    int N = Integer . parseInt ( br . readLine ( ) ) ;
    HashMap < Integer , Set < Integer >> G = new HashMap < Integer , Set < Integer >> ( ) ;
    {
      int numEdges = 0 ;
      for ( Integer i : G . keySet ( ) ) {
        Set < Integer > s = G . get ( i ) ;
        for ( Integer j : s ) {
          if ( j . equals ( i ) ) {
            numEdges ++ ;
          }
        }
      }
      if ( numEdges / 2 == G . size ( ) - 1 ) {
        return 1 ;
      }
      else {
        return 0 ;
      }
    }
    {
      int [ ] [ ] edges = new int [ N ] [ 2 ] ;
      Set < Integer > leaves = new HashSet < Integer > ( ) ;
      int dcount = 0 ;
      for ( Integer i : edges ) {
        Set < Integer > neighbors = G . get ( i ) ;
        int ncount = 0 ;
        for ( Integer j : neighbors ) {
          if ( j . equals ( i ) ) {
            ncount ++ ;
          }
        }
        if ( ncount != 1 && ncount != 2 && ncount != 3 ) {
          return 0 ;
        }
        if ( ncount == 1 ) {
          leaves . add ( i ) ;
        }
        if ( ncount == 2 ) {
          dcount ++ ;
          int rootcan = i ;
        }
      }
      if ( dcount != 1 && root == - 1 ) {
        return 0 ;
      }
      if ( root != - 1 ) {
        rootcan = root ;
      }
      return isTree ( edges . containsAll ( leaves ) , rootcan ) ;
    }
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int src = Integer . parseInt ( br . readLine ( ) ) , dst = Integer . parseInt ( br . readLine ( ) ) ;
    src -- ;
    dst -- ;
    if ( G . containsKey ( src ) ) {
      G . put ( src , dst ) ;
    }
    else {
      G . put ( src , new HashSet < Integer > ( ) ) ;
    }
    if ( G . containsKey ( dst ) ) {
      G . put ( dst , new HashSet < Integer > ( ) ) ;
    }
  }
  int minDels = N - 1 ;
  for ( int combo = 1 ;
  combo <= 2 * N ;
  combo ++ ) {
    Set < Integer > in = new