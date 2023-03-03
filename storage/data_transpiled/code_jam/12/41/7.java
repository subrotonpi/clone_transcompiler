static final String solve ( ) throws IOException {
  if ( __name__ . equals ( "solve" ) ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int t = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _t = 0 ;
    _t < t ;
    ++ _t ) {
      int n = Integer . parseInt ( br . readLine ( ) ) ;
      int [ ] dists = new int [ n ] ;
      int [ ] lengths = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      ++ i ) {
        int d = Integer . parseInt ( br . readLine ( ) ) ;
        int l = Integer . parseInt ( br . readLine ( ) ) ;
        dists [ i ] = d ;
        lengths [ i ] = l ;
      }
      int D = Integer . parseInt ( br . readLine ( ) ) ;
      dists [ n ] = D ;
      lengths [ n ] = 0 ;
      ++ n ;
      int [ ] maxSwings = new int [ n ] ;
      assert lengths [ 0 ] >= dists [ 0 ] ;
      maxSwings [ 0 ] = dists [ 0 ] ;
      for ( int i = 0 ;
      i < n ;
      ++ i ) {
        for ( int j = i + 1 ;
        j < n ;
        ++ j ) {
          if ( dists [ j ] - dists [ i ] > maxSwings [ i ] ) break ;
          int swing = Math . min ( lengths [ j ] , dists [ j ] - dists [ i ] ) ;
          maxSwings [ j ] = Math . max ( maxSwings [ j ] , swing ) ;
        }
      }
      System . out . println ( "Case #" + ( _t + 1 ) + ": " + ( maxSwings [ maxSwings . length - 1 ] == - 1 ? "NO" : "YES" ) ) ;
    }
  }
  return null ;
}
