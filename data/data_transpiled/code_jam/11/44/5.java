@ Nullable public static int [ ] [ ] solve ( ) {
  Scanner fin = new Scanner ( System . in ) ;
  PrintWriter fout = new PrintWriter ( System . out ) ;
  int numcases = Integer . parseInt ( fin . nextLine ( ) ) ;
  int [ ] [ ] primes = sieve ( 1000000 ) ;
  for ( int i = 1 ;
  i <= numcases ;
  i ++ ) {
    int casenum = primes [ i ] [ 0 ] ;
    if ( ( casenum > 1 ) && ( casenum < maxthreatnum ) ) maxthreatnum -= costs [ 1 ] [ 1 ] ;
    String [ ] line = fin . nextLine ( ) . split ( " " ) ;
    int numplanets = Integer . parseInt ( line [ 0 ] ) ;
    int numwormholes = Integer . parseInt ( line [ 1 ] ) ;
    int [ ] [ ] wormholes = new int [ numplanets ] [ numwormholes ] ;
    for ( int i = 0 ;
    i < numplanets ;
    i ++ ) {
      int [ ] ints = Arrays . stream ( line [ 1 ] . split ( "," ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
      wormholes [ ints [ 0 ] ] [ ints [ 1 ] ] = i ;
      wormholes [ ints [ 1 ] ] [ ints [ 0 ] ] = i ;
    }
    int [ ] [ ] evalnodes = new int [ numplanets ] [ numwormholes ] ;
    costs [ 0 ] = 0 ;
    while ( ( evalnodes . length > 0 ) && ( evalnodes [ 0 ] . length > maxthreatnum ) ) {
      int source = evalnodes [ 0 ] . length ;
      for ( int i = 0 ;
      i < wormholes [ source ] . length ;
      i ++ ) {
        if ( ( costs [ i ] > costs [ source ] + 1 ) && ( costs [ i ] > costs [ source ] + 1 ) ) {
          costs [ i ] = costs [ source ] + 1 ;
          pathsin [ i ] = new int [ source ] ;
          if ( ( source < 0 ) && ( costs [ source ] == 0 ) ) maxthreatnum ++ ;
        }
        else if ( ( source == 0 ) && ( costs [ source ] == 0 ) ) {
          threatened [ source ] [ 0 ] = source ;
        }
      }
    }
    threened = new int [ numplanets ] [ numwormholes ] ;
    evalnodes [ 0 ] = new int [ threened [ 0