static final String getTestData ( ) {
  final String testdata1 = "\
  8
  6
  3
  1
  2
  7
  4
  8
  5
  " ;
  final String testData2 = "\
  6
  3
  2
  5
  1
  4
  6
  " ;
  final String testData3 = "\
  4
  1
  3
  2
  4
  " ;
  final int td_num = 3 ;
  {
    if ( td_num == 1 ) {
      return testdata1 ;
    }
    if ( td_num == 2 ) {
      return testdata2 ;
    }
    if ( td_num == 3 ) {
      return testData3 ;
    }
  }
  if ( false ) {
    try {
      final Scanner scanner = new Scanner ( System . in ) ;
      scanner . useDelimiter ( "\\\n" ) ;
      final int n = scanner . nextInt ( ) ;
      final int [ ] p = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        p [ i ] = scanner . nextInt ( ) ;
      }
      scanner . close ( ) ;
      final int [ ] a = new int [ n ] ;
      int cnt = 1 ;
      int ans = 0 ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        a [ p [ i ] - 1 ] = i ;
      }
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int pre ;
        if ( i == 0 ) {
          pre = a [ 0 ] ;
        }
        else {
          if ( a [ i ] > pre ) {
            cnt ++ ;
          }
          else {
            ans = Math . max ( ans , cnt ) ;
            cnt = 1 ;
          }
        }
      }
      ans = Math . max ( ans , cnt ) ;
      pre = a [ i ] ;
    }
    catch ( final Exception e ) {
      e . printStackTrace ( ) ;
    }
  }
  System . out . println ( n - ans ) ;
  return testdata1 ;
}
