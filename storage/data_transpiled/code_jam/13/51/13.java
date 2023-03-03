static final double [ ] [ ] resize ( double [ ] [ ] array ) {
  for ( int test = 0 ;
  test < input . length ;
  test ++ ) {
    int B = Integer . parseInt ( input [ test ] [ 0 ] ) ;
    int N = Integer . parseInt ( input [ test ] [ 1 ] ) ;
    int [ ] X = ArrayUtil . copy ( array ) ;
    Arrays . sort ( X ) ;
    double ans = 0 ;
    for ( int i = 0 ;
    i < 2001 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 37 ;
      j ++ ) {
        if ( X [ j ] > i ) {
          continue ;
        }
        double a = 0 ;
        double b = 0 ;
        for ( int k = 0 ;
        k < j + 1 ;
        k ++ ) {
          a += i - X [ k ] ;
          b += 36. * ( i - X [ k ] ) / ( j + 1 ) ;
        }
        for ( int k = j + 1 ;
        k < 37 ;
        k ++ ) {
          a += Math . max ( 0 , ( i + 1 ) - X [ k ] ) ;
        }
        if ( a <= B ) {
          ans = Math . max ( ans , b - a ) ;
        }
      }
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + ans ) ;
    System . out . flush ( ) ;
  }
  return array ;
}
