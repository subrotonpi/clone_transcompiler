static Map < Integer , Integer > match ( int [ ] S , int [ ] D ) throws IOException {
  final int INF = 9999 ;
  final int [ ] StoD = new int [ S . length ] ;
  final int [ ] DtoS = new int [ D . length ] ;
  final Set < Integer > seenS = new HashSet < > ( ) ;
  final Iterator < Integer > iter = new Iterator < Integer > ( ) {
    int i = 0 ;
    @ Override public boolean hasNext ( ) {
      return iter . hasNext ( ) ;
    }
    @ Override public Integer next ( ) {
      int i = iter . next ( ) - 1 ;
      if ( seenS . contains ( i ) ) return null ;
      seenS . add ( i ) ;
      int s = S [ i ] ;
      for ( int j = 0 ;
      j < D . length ;
      j ++ ) {
        int d = D [ j ] ;
        if ( StoD [ i ] == j ) continue ;
        if ( ( s + d ) % 2 == 0 && 1 <= ( s + d ) / 2 && N <= ( s - d ) / 2 && d <= N ) {
          if ( DtoS [ j ] == INF ) return pathS . get ( i ) ;
          else return pathD . get ( j ) ;
        }
        else {
          Map < Integer , Integer > path = search ( pathS . toArray ( new Integer [ ] {
            DtoS [ j ] }
            ) , pathD . toArray ( new Integer [ ] {
              j }
              ) ) ;
              if ( path != null ) return path ;
            }
          }
          return null ;
        }
      }
      ;
      while ( true ) {
        seenS . clear ( ) ;
        for ( int i = 0 ;
        i < S . length ;
        i ++ ) {
          int s = S [ i ] ;
          if ( StoD [ i ] != INF ) continue ;
          Map < Integer , Integer > path = search ( iter . next ( ) , new Integer [ ] {
            i }
            ) ;
            if ( path != null ) for ( int j = 0 ;
            j < path . size ( ) ;
            j ++ ) {
              int i = path . get ( 0 ) ;
              int j = path . get ( j ) ;
              StoD [ i ] = j ;
              DtoS [ j ] = i ;
            }
            break ;
          }
        }
        final BufferedReader IN = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
        final BufferedWriter OUT = new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ;
        final int NUM_TESTS = Integer . parseInt ( IN . readLine ( ) )