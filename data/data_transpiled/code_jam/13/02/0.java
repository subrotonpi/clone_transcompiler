static final boolean isCase ( ) {
  final boolean timeit = true ;
  final boolean debugv = false ;
  {
    final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int testCase = 1 ;
    testCase <= T ;
    testCase ++ ) {
      doCase ( testCase ) ;
    }
  }
  final int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int M = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int [ ] [ ] lawn = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int [ ] row = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      row [ j ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    }
    if ( row . length != M ) {
      throw new IllegalStateException ( "incorrect line length" ) ;
    }
    lawn [ i ] = row ;
  }
  boolean lawnPossible = true ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      boolean rowPossible = true ;
      for ( int k = 0 ;
      k < N ;
      k ++ ) {
        if ( lawn [ k ] [ j ] > lawn [ i ] [ j ] ) {
          rowPossible = false ;
        }
      }
      boolean colPossible = true ;
      for ( int k = 0 ;
      k < M ;
      k ++ ) {
        if ( lawn [ i ] [ k ] > lawn [ i ] [ j ] ) {
          colPossible = false ;
        }
      }
      if ( ! ( rowPossible || colPossible ) ) {
        lawnPossible = false ;
      }
    }
  }
  final String result = lawnPossible ? "YES" : "NO" ;
  debug ( "{}\n" ) ;
  System . out . print ( "Case #" + testCase + ": {}\n" ) ;
}
