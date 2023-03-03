public static void solve ( int nr , int nc , List < Pair > pairs ) throws IOException {
  Pair [ ] pis = new Pair [ 2 * ( nr + nc ) ] ;
  Iterator < Pair > iterator = pairs . iterator ( ) ;
  int i = 0 ;
  int j = 0 ;
  while ( iterator . hasNext ( ) ) {
    Pair pi = iterator . next ( ) ;
    pis [ i ++ ] = pi ;
    pis [ j ++ ] = pi ;
  }
  Pair [ ] sortedPairs = new Pair [ nr ] ;
  while ( iterator . hasNext ( ) ) {
    if ( pis . equals ( new Pair [ ] {
      Pair . ZERO , Pair . ONE , Pair . ZERO , Pair . ONE }
      ) ) {
      }
      if ( pis [ 0 ] . equals ( pis [ pis . length - 1 ] ) ) {
        sortedPairs [ i ++ ] = pairs . get ( pis [ 0 ] ) ;
        iterator . remove ( ) ;
      }
      else if ( backward_len != 0 ) {
        trace ( iterator , i , true ) ;
      }
      else {
        System . out . println ( "IMPOSSIBLE" ) ;
        return ;
      }
    }
    for ( int r = 0 ;
    r < xrange ( nr ) ;
    r ++ ) {
      for ( int c = 0 ;
      c < xrange ( nc ) ;
      c ++ ) {
        if ( pis [ c ] == null ) {
          sortedPairs [ r ] . set ( c , "/" ) ;
        }
      }
    }
    if ( getClass ( ) . getName ( ) . equals ( "java.io.BufferedReader" ) ) {
      final BufferedReader is = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
      final int [ ] pairTokens = new int [ nr ] ;
      for ( int i = 0 ;
      i < pairTokens . length ;
      i ++ ) {
        pairTokens [ i ] = Integer . parseInt ( is . readLine ( ) ) ;
      }
      pairs = new Pair [ nr ] ;
      for ( int j = 0 ;
      j < pairTokens . length ;
      j ++ ) {
        if ( pis [ j ] . equals ( pair . first ) ) {
          sortedPairs [ j ] = pairs . get ( pairTokens [ j ] ) ;
          iterator . remove ( ) ;
          break ;
        }
      }
    }
    else {
      System . out . println ( "IMPOSSIBLE" ) ;
      return ;
    }
    final String [ ] [ ] grid = new String [ nr ] [ nc ] ;
    for ( int r = 0 ;
    r < nr ;
    r ++ )