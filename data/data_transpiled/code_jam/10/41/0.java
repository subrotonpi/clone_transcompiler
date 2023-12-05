@ GwtIncompatible ( "java.io.BufferedReader" ) public static void main ( String [ ] args ) throws IOException {
  BufferedReader inf = new BufferedReader ( new FileReader ( "file.in" ) ) ;
  PrintWriter ouf = new PrintWriter ( new BufferedWriter ( new FileWriter ( "file.out" ) ) ) ;
  int counttests = Integer . parseInt ( inf . readLine ( ) . split ( " " ) [ 0 ] ) ;
  int testCase = 0 ;
  /* answer */
  if ( testCase > counttests ) {
    exit ( ) ;
  }
  testCase ++ ;
  System . out . println ( >>> ouf + "Case #" + testCase + ": " + o ) ;
  System . out . println ( "Case #" + testCase + ": " + o ) ;
  for ( int ii = 0 ;
  ii < xrange ( counttests ) ;
  ii ++ ) {
    int n = Integer . parseInt ( inf . readLine ( ) . split ( " " ) [ 0 ] ) - 1 ;
    String [ ] a = new String [ 2 * n + 1 ] ;
    for ( int i = 0 ;
    i < xrange ( 2 * n + 1 ) ;
    i ++ ) {
      a [ i ] = inf . readLine ( ) ;
      a [ i ] = a [ i ] . substring ( 0 , a [ i ] . length ( ) - 1 ) ;
      while ( a [ i ] . length ( ) < 2 * n + 1 ) {
        a [ i ] += ' ' ;
      }
    }
    int tekh = 0 ;
    int tekv = 0 ;
    for ( int i = 0 ;
    i < xrange ( 2 * n + 1 ) ;
    i ++ ) {
      int resh = 1 ;
      int resv = 1 ;
      for ( int k = 0 ;
      k < xrange ( 2 * n + 1 ) ;
      k ++ ) {
        for ( int j = 0 ;
        j < xrange ( 2 * n + 1 ) ;
        j ++ ) {
          if ( i - j < 0 || i + j >= 2 * n + 1 ) {
            continue ;
          }
          if ( a [ i - j ] . charAt ( k ) != a [ i + j ] . charAt ( k ) && a [ i - j ] . charAt ( k ) != ' ' && a [ i + j ] . charAt ( k ) != ' ' ) {
            resh = 0 ;
          }
          if ( a [ k ] . charAt ( i - j ) != a [ k ] . charAt ( j