@ GwtIncompatible ( "java.util.Scanner" ) private static int [ ] getInts ( ) {
  return new int [ ] {
    Integer . parseInt ( stdin . readLine ( ) ) , Integer . parseInt ( stdin . readLine ( ) ) }
    ;
    final int T = getInts ( ) ;
    for ( int tc = 1 ;
    tc <= 1 ;
    tc ++ ) {
      final int N = getInts ( ) ;
      final int C = getInts ( ) ;
      final int M = getInts ( ) ;
      final Pb [ ] pbs = new Pb [ M ] ;
      for ( int k = 0 ;
      k < pbs . length ;
      k ++ ) pbs [ k ] = getInts ( ) ;
      final ArrayList < Integer > tickets = new ArrayList < Integer > ( ) ;
      for ( int i = 1 ;
      i < C + 1 ;
      i ++ ) tickets . add ( new ArrayList < Integer > ( ) ) ;
      final int [ ] reqs = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) reqs [ i ] = 0 ;
      for ( Pb pb : pbs ) {
        tickets . get ( pb . y - 1 ) . add ( pb . x ) ;
        reqs [ pb . x - 1 ] ++ ;
      }
      tickets . trimToSize ( ) ;
      int trips = Collections . max ( tickets . stream ( ) . mapToInt ( z -> z ) . sum ( ) ) ;
      int totsofar = 0 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        totsofar += reqs [ i ] ;
        trips = Math . max ( trips , ( totsofar + i ) / ( i + 1 ) ) ;
      }
      int upgrades = 0 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) upgrades += Math . max ( 0 , reqs [ i ] - trips ) ;
      System . out . println ( "Case #" + tc + ": " + trips + " " + upgrades ) ;
    }
    return tickets . toArray ( new int [ tickets . size ( ) ] ) ;
  }
  