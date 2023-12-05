static int unhap ( int [ ] comb , int r , int c ) {
  int unhappiness = 0 ;
  for ( int i = 0 ;
  i < r * c ;
  i ++ ) {
    if ( i % c > 0 && comb [ i ] == comb [ i - 1 ] == 1 ) {
      unhappiness ++ ;
    }
    if ( i % c < c - 1 && comb [ i ] == comb [ i + 1 ] == 1 ) {
      unhappiness ++ ;
    }
    if ( i / c > 0 && comb [ i ] == comb [ i - c ] == 1 ) {
      unhappiness ++ ;
    }
    if ( i / c < r - 1 && comb [ i ] == comb [ i + c ] == 1 ) {
      unhappiness ++ ;
    }
  }
  try {
    File inFile = new File ( "B-large.in" ) ;
    try ( File outFile = new File ( "B.out" ) ) {
      int nCases = Integer . parseInt ( ( String ) inFile . list ( ) [ 0 ] ) ;
      for ( int testCase = 1 ;
      testCase <= nCases ;
      testCase ++ ) {
        System . out . println ( testCase ) ;
        r = Integer . parseInt ( ( String ) inFile . list ( ) [ 0 ] ) ;
        c = Integer . parseInt ( ( String ) inFile . list ( ) [ 1 ] ) ;
        n = Integer . parseInt ( ( String ) inFile . list ( ) [ 0 ] ) ;
        System . out . println ( "Case #" + testCase + ": " + optimal2 ( r , c , n ) ) ;
      }
    }
  }
  catch ( Exception e ) {
    e . printStackTrace ( ) ;
  }
  return unhappiness / 2 ;
}
