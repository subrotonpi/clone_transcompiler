static final String getUpperCaseCode ( ) throws IOException {
  if ( __name__ == null ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _T = xrange ( T ) ;
    _T < T ;
    _T ++ ) {
      StringBuilder sb = new StringBuilder ( ) ;
      int first = 0 ;
      for ( int i : xrange ( s . length ( ) - 1 ) ) {
        if ( sb . charAt ( i ) < sb . charAt ( i + 1 ) ) {
          first = i + 1 ;
        }
        if ( sb . charAt ( i ) > sb . charAt ( i + 1 ) ) {
          sb . setCharAt ( first , ( char ) ( sb . charAt ( first ) - 1 ) ) ;
          for ( int j : xrange ( first + 1 , sb . length ( ) ) ) {
            sb . setCharAt ( j , '9' ) ;
          }
          break ;
        }
      }
      System . out . println ( "Case #" + ( _T + 1 ) + ": " + Integer . parseInt ( sb . toString ( ) ) ) ;
    }
  }
  return null ;
}
