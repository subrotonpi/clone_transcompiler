@ VisibleForTesting static void lg ( double a ) {
  System . err . println ( String . valueOf ( a ) ) ;
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int testNr = 1 ;
  testNr <= T ;
  testNr ++ ) {
    System . err . println ( "Case #" + testNr + ":" ) ;
    int x = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int s = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int r = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int [ ] ws = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int b = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      int e = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      int w = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      ws [ i ] = new int [ w ] ;
      ws [ i ] [ e - b ] = 1 ;
    }
    int wlen = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    ws [ wlen ] = new int [ x - wlen ] ;
    for ( int i = 0 ;
    i < x ;
    i ++ ) {
      ws [ i ] [ 0 ] = x - wlen ;
    }
    Arrays . sort ( ws ) ;
    double time = Double . parseDouble ( t ) ;
    t = Double . parseDouble ( t ) ;
    double total = 0.0 ;
    for ( int i = 0 ;
    i < x ;
    i ++ ) {
      int w = ws [ i ] . intValue ( ) ;
      int l = x - wlen ;
      double needed ;
      if ( time < 1e-7 ) {
        needed = ( double ) l / ( s + w ) ;
        total += needed ;
        continue ;
      }
      if ( ( r + w ) * time >= l ) {
        needed = ( double ) l / ( r + w ) ;
        time -= needed ;
        total += needed ;
      }
      else {
        needed = time ;
        double X = ( ( double ) l - time * ( r + w ) ) / ( s + w ) ;
        needed += X ;
        time = 0.0 ;
        total += needed