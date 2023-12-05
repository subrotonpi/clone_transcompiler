public static void main ( String [ ] args ) {
  try {
    File inFile = new File ( "C-small-1-attempt0.in" ) ;
    File outFile = new File ( "C-small-1-attempt0.out" ) ;
    try {
      outFile . createNewFile ( ) ;
    }
    catch ( IOException e ) {
      e . printStackTrace ( ) ;
    }
    int cases = Integer . parseInt ( next ( inFile ) ) ;
    for ( int testCase = 1 ;
    testCase <= cases ;
    testCase ++ ) {
      int n = Integer . parseInt ( next ( inFile ) ) ;
      int k = Integer . parseInt ( next ( inFile ) ) ;
      int u = Math . round ( Double . parseDouble ( next ( inFile ) ) * 10000 ) ;
      int [ ] p = new int [ k ] ;
      for ( int i = 0 ;
      i < p . length ;
      i ++ ) {
        p [ i ] = Math . round ( Double . parseDouble ( next ( inFile ) ) * 10000 ) ;
      }
      Arrays . sort ( p ) ;
      Arrays . fill ( p , 10000 ) ;
      int i = 0 ;
      while ( u > 0 && i < p . length ) {
        while ( i < p . length && p [ i ] == p [ i + 1 ] ) {
          i ++ ;
        }
        int x = Math . min ( ( p [ i + 1 ] - p [ i ] ) * ( i + 1 ) , u ) ;
        for ( int j = 0 ;
        j < i + 1 ;
        j ++ ) {
          p [ j ] += x / ( i + 1 ) ;
        }
        u -= x ;
      }
      int product = 1 ;
      for ( int j = 0 ;
      j < p . length ;
      j ++ ) {
        product *= p [ j ] / 10000 ;
      }
      System . out . println ( testCase + ": " + product ) ;
      System . out . println ( "Case #" + testCase + ": " + product ) ;
    }
  }
  catch ( Exception e ) {
    e . printStackTrace ( ) ;
  }
}
