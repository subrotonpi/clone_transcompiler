public static int [ ] readLargeIntLine ( File f_in ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( "../Downloads/A-large.in" ) ) ;
  int N = Integer . parseInt ( br . readLine ( ) . replaceAll ( " " , "" ) ) ;
  for ( int test_case = 0 ;
  test_case < N ;
  test_case ++ ) {
    int n = Integer . parseInt ( br . readLine ( ) . replaceAll ( " " , "" ) ) ;
    int [ ] x = ( int [ ] ) br . readLine ( ) . split ( "\\s+" ) ;
    int [ ] y = ( int [ ] ) br . readLine ( ) . split ( "\\s+" ) ;
    if ( ( ! ( x . length == y . length ) ) || ( ! ( n == x . length ) ) ) {
      System . out . println ( "****** NOT EQUAL LENS*****" ) ;
    }
    for ( int ii = 0 ;
    ii < n ;
    ii ++ ) {
      x [ ii ] = Integer . parseInt ( x [ ii ] ) ;
      y [ ii ] = Integer . parseInt ( y [ ii ] ) ;
    }
    Arrays . sort ( x ) ;
    Arrays . sort ( y ) ;
    Arrays . reverse ( y ) ;
    int minSum = 0 L ;
    for ( int ii = 0 ;
    ii < n ;
    ii ++ ) {
      minSum = minSum + x [ ii ] * y [ ii ] ;
    }
    System . out . println ( "Case #" + ( test_case + 1 ) + ": " + minSum ) ;
  }
  return new int [ ] {
  }
  ;
}
