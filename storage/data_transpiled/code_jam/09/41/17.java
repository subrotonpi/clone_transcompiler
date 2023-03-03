@ Test ( description = "" ) public static void main ( String problem ) throws IOException {
  String inputFileName = problem + ".in" ;
  String outputFileName = problem + ".out" ;
  String testData = "3\n2\n10\n11\n3\n001\n100\n010\n4\n1110\n1100\n1100\n1000" ;
  testData = null ;
  {
    int [ ] output = new int [ N ] ;
    int iLine = 0 ;
    int N = Integer . parseInt ( input . substring ( iLine , iLine ) . trim ( ) ) ;
    iLine ++ ;
    for ( int testCase = 1 ;
    testCase <= N ;
    testCase ++ ) {
      System . out . println ( "Case " + testCase ) ;
      int nn = Integer . parseInt ( input . substring ( iLine , iLine ) . trim ( ) ) ;
      iLine ++ ;
      N = new int [ nn ] ;
      for ( int i = 0 ;
      i < nn ;
      i ++ ) {
        String ss = input . substring ( iLine , iLine ) . trim ( ) ;
        N [ i ] = - 1 ;
        for ( int j = nn - 1 ;
        j >= 0 ;
        j -- ) {
          if ( ss . charAt ( j ) == '1' ) {
            N [ N . length - 1 ] = i ;
            break ;
          }
        }
        iLine ++ ;
      }
      int result = 0 ;
      for ( int i = 0 ;
      i < nn - 1 ;
      i ++ ) {
        if ( N [ i ] <= i ) continue ;
        int ii = - 1 ;
        for ( int j = i + 1 ;
        j < nn ;
        j ++ ) {
          if ( N [ j ] <= i ) {
            ii = j ;
            break ;
          }
        }
        for ( int k = ii ;
        k > i ;
        k -- ) {
          N [ k ] = N [ k - 1 ] ;
          result ++ ;
        }
      }
      output [ iLine ] = result ;
    }
  }
}
