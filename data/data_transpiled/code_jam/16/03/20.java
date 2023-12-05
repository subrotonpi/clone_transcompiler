static final void solve ( ) {
  final SSSSW ssw = new SSW ( ) ;
  int testCase = 0 ;
  String input ;
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  try {
    if ( testCase > 0 ) {
      Arrays . stream ( input . trim ( ) . split ( " " ) ) . forEach ( x -> {
        N = Integer . parseInt ( x . trim ( ) ) ;
        J = Integer . parseInt ( x . trim ( ) ) ;
        System . out . println ( "Case #" + testCase + ":" ) ;
        assert ( N & 1 ) == 0 && J <= 2 * ( N / 2 - 1 ) ;
        for ( int j = 0 ;
        j < J ;
        j ++ ) {
          String s = "1" ;
          for ( int k = 0 ;
          k < N / 2 - 1 ;
          k ++ ) s += Integer . toString ( j >> k & 1 ) * 2 ;
          s += "1" ;
          ssw . write ( s ) ;
          for ( int k = 2 ;
          k < 11 ;
          k ++ ) ssw . write ( ' ' + ( k + 1 ) ) ;
          System . out . println ( ) ;
        }
      }
      ) ;
    }
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
  finally {
    try {
      br . close ( ) ;
    }
    catch ( IOException e ) {
      e . printStackTrace ( ) ;
    }
  }
  testCase ++ ;
}
