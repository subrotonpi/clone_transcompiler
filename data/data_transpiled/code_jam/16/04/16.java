static final Scanner scanner = new Scanner ( System . in ) {
  private final String nextLine = System . nextLine ( ) ;
  try {
    final String [ ] lines = nextLine . split ( "\\s+" ) ;
    final int T = Integer . parseInt ( lines [ 0 ] , 10 ) ;
    for ( int tt = 1 ;
    tt < T ;
    tt ++ ) {
      final String l = lines [ tt ] ;
      final int K = Integer . parseInt ( l . split ( "\\s+" ) [ 0 ] , 10 ) ;
      final int C = Integer . parseInt ( l . split ( "\\s+" ) [ 1 ] , 10 ) ;
      final int S = Integer . parseInt ( l . split ( "\\s+" ) [ 2 ] , 10 ) ;
      final int numberSpotsInfluenced = C ;
      final boolean possible = ( C * S >= K ) ;
      if ( ! possible ) {
        System . out . println ( "Case #" + ( tt + 1 ) + ":" + "IMPOSSIBLE" ) ;
        continue ;
      }
      final int [ ] positionsToCheck = new int [ K ] ;
      final List < Integer > positions = new ArrayList < > ( ) ;
      while ( positionsToCheck . length > 0 ) {
        final int [ ] array = new int [ C ] ;
        positionsToCheck = Arrays . copyOf ( positionsToCheck , C ) ;
        int pos = 0 ;
        for ( int j = 0 ;
        j < array . length ;
        j ++ ) {
          pos *= K ;
          pos += array [ j ] ;
        }
        assert pos <= K * C ;
        positions . add ( pos + 1 ) ;
      }
      System . out . println ( "Case #" + ( tt + 1 ) + ":" + " " + Arrays . toString ( positions . toArray ( ) ) ) ;
    }
  }
  catch ( final Exception e ) {
    e . printStackTrace ( ) ;
  }
  return scanner ;
}
