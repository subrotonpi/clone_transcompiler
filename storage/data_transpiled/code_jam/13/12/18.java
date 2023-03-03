public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t : xrange ( T ) ) {
    long E = in . nextLong ( ) ;
    long R = in . nextLong ( ) ;
    long N = in . nextLong ( ) ;
    long [ ] v = in . getBiggers ( ) ;
    int [ ] nextBigger = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = i + 1 ;
      j < N ;
      j ++ ) {
        if ( v [ j ] > v [ i ] ) {
          nextBigger [ i ] = j ;
          break ;
        }
      }
    }
    int res = 0 ;
    long energy = E ;
    for ( int task = 0 ;
    task < N ;
    task ++ ) {
      long spending ;
      if ( nextBigger [ task ] == - 1 ) {
        spending = energy ;
      }
      else {
        long difference = nextBigger [ task ] - task ;
        spending = Math . max ( 0 , energy + difference * R - E ) ;
        spending = Math . min ( spending , energy ) ;
      }
      res = res + spending * v [ task ] ;
      energy = Math . min ( E , energy - spending + R ) ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + res ) ;
  }
  return res ;
}
