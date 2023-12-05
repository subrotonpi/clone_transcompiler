@ VisibleForTesting static void input ( Scanner input ) {
  int T = input . nextInt ( ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int B = input . nextInt ( ) , N = input . nextInt ( ) ;
    int [ ] m = input . split ( " " ) ;
    double tmin = max ( N - B , 0 ) / sum ( m ) ;
    N -= sum ( tmin / m [ b ] ) ;
    h = new int [ B ] ;
    for ( int b = 0 ;
    b < B ;
    b ++ ) {
      h [ b ] = ( ceil ( tmin / m [ b ] ) * m [ b ] ) ;
    }
    Arrays . sort ( h ) ;
    int t = 0 , b = 0 ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      t = h [ i ] = ( t + m [ b ] ) ;
      b = b + 1 ;
    }
    System . out . println ( "Case #" + testCase + ": " + ( b + 1 ) ) ;
  }
}
