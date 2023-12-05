@ GwtIncompatible ( "java.util.Scanner" ) public static int [ ] [ ] readAllInts ( ) throws IOException {
  BufferedReader inf = new BufferedReader ( new FileReader ( "file.in" ) ) ;
  PrintWriter ouf = new PrintWriter ( "file.out" ) ;
  int counttests = Integer . parseInt ( inf . readLine ( ) . split ( " " ) [ 0 ] ) ;
  int testCase = 0 ;
  /* answer */
  if ( testCase > counttests ) {
    exit ( ) ;
  }
  testCase ++ ;
  System . out . println ( >>> ouf + "Case #" + testCase + ": " + Integer . toString ( testCase ) ) ;
  System . out . println ( "Case #" + testCase + ": " + Integer . toString ( testCase ) ) ;
  int [ ] [ ] dyn = n = nn = m = p = 0 ;
  /* rec */
  if ( v >= nn - 1 ) {
    if ( c >= m [ v - nn + 1 ] ) {
      return 0 ;
    }
    else {
      return 1000000000 ;
    }
  }
  if ( dyn [ c ] [ v ] == - 1 ) {
    dyn [ c ] [ v ] = Math . min ( p [ v ] + rec ( c + 1 , v * 2 + 1 ) + rec ( c + 1 , v * 2 + 2 ) , rec ( c , v * 2 + 1 ) + rec ( c , v * 2 + 2 ) ) ;
  }
  for ( int iii = 0 ;
  iii < xrange ( counttests ) ;
  iii ++ ) {
    n = Integer . parseInt ( inf . readLine ( ) . split ( " " ) [ 0 ] ) ;
    nn = 2 * n ;
    m = Integer . parseInt ( inf . readLine ( ) . split ( " " ) [ 0 ] ) ;
    for ( int i : xrange ( m . length ) ) {
      m [ i ] = n - m [ i ] ;
    }
    p = new int [ nn ] ;
    dyn = new int [ n ] ;
    for ( int i = 0 ;
    i < dyn . length ;
    i ++ ) {
      dyn [ i ] = new int [ nn ] ;
      for ( int j = 0 ;
      j < nn ;
      j ++ ) {
        p [ 2 * ( n - i - 1 ) - 1 + j ] = tmp [ j ] ;
      }
    }
    answer ( dyn [ i ] [ v ] ) ;
  }
  return dyn ;
}
