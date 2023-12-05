public static String binary ( int n ) {
  if ( n == 0 ) return "" ;
  return ( n % 2 == 1 ) ? "1" + binary ( n / 2 ) : "0" + binary ( n / 2 ) ;
}
int T = Integer . parseInt ( readLine ( ) ) ;
for ( int test_case = 0 ;
test_case < T ;
test_case ++ ) {
  Arrays . stream ( readLine ( ) . split ( " " ) ) . forEach ( line -> {
    int B = Integer . parseInt ( readLine ( ) ) ;
    int M = Integer . parseInt ( readLine ( ) ) ;
    int maxval = 2 * ( B - 2 ) ;
    String answer ;
    if ( M > maxval ) {
      answer = "IMPOSSIBLE" ;
    }
    else if ( M == maxval ) {
      answer = "POSSIBLE\n" ;
      for ( int i = 0 ;
      i < B ;
      i ++ ) {
        StringBuilder line = new StringBuilder ( ) ;
        for ( int j = 0 ;
        j < B ;
        j ++ ) {
          line . append ( ( j > i ) ? "1" : "0" ) ;
        }
        answer += line . toString ( ) + ( i == B - 1 ? "" : "\n" ) ;
      }
    }
    else {
      answer = "POSSIBLE\n" ;
      String b = binary ( M ) + "0" ;
      for ( int i = 0 ;
      i < B - 1 ;
      i ++ ) {
        StringBuilder line = new StringBuilder ( ) ;
        for ( int j = 0 ;
        j < B - 1 ;
        j ++ ) {
          line . append ( ( j > i ) ? "1" : "0" ) ;
        }
        String lastLetter = i == 0 ? "0" : b . charAt ( i - 1 ) ;
        line . append ( lastLetter ) ;
        answer += line . toString ( ) + ( i == B - 1 ? "" : "\n" ) ;
      }
      answer += "0" ;
    }
    System . out . println ( "Case #" + ( test_case + 1 ) + ": " + answer ) ;
  }
  return "" ;
}
