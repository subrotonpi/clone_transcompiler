@ Internal public static String toString ( ) {
  class Case {
    int exp ;
    int i ;
    int exp ;
    String s ;
    int i ;
    int i ;
    int exp = Integer . parseInt ( s . readString ( ) ) ;
    @ Override public String solve ( ) {
      double x = 3.0 + sqrt ( 5.0 ) ;
      double x10 = x / 10.0 ;
      double angle = acos ( x10 ) ;
      dp = new double [ 31 ] ;
      for ( i = 0 ;
      i < 31 ;
      i ++ ) dp [ i ] = 1 ;
      dp [ 1 ] = x % 1000 ;
      dp [ 2 ] = x * x % 1000 ;
      for ( i = 1 ;
      i <= 31 ;
      i ++ ) {
        if ( dp [ i ] == 1 ) {
          dp [ i ] = dp [ i - 1 ] * x ;
          int j = i * 2 ;
          while ( j <= 31 ) {
            dp [ j ] = dp [ i ] * 100.0 * ( ( 1.0 + cos ( 2.0 * angle ) ) / 2.0 ) ;
            j *= 2 ;
          }
        }
      }
      return String . format ( "%03d" , dp [ exp ] % 1000 ) ;
    }
  }
  class Contents {
    public String [ ] read ( InputStream in ) throws IOException {
      List < String > list = new ArrayList < String > ( ) ;
      for ( String line : in ) list . add ( line . trim ( ) ) ;
      i = 0 ;
    }
    @ Override public String read ( InputStream in ) throws IOException {
      return readList ( in ) . get ( 0 ) ;
    }
    @ Override public String [ ] readList ( int len ) throws IOException {
      String [ ] result = new String [ len ] ;
      System . arraycopy ( list , i , result , 0 , len ) ;
      i += len ;
      return result ;
    }
  }
  final InputStream in = new BufferedInputStream ( in ) ;
  s = new Contents ( in ) ;
  int numCases = Integer . parseInt ( s . readString ( ) ) ;
  for ( int caseNum = 0 ;
  caseNum < numCases ;
  caseNum ++ ) {
    Case testCase = new Case ( s ) ;
    System . out . println ( "Case #" + ( caseNum + 1 ) + ": " + testCase . solve ( ) ) ;
  }
  return "Case #" + ( caseNum + 1 ) + ": " + testCase . solve ( ) ;
}
