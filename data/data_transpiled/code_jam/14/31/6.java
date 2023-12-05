@ VisibleForTesting static void debug ( String ... args ) {
  System . err . println ( args ) ;
  Scanner fin = new Scanner ( System . in ) ;
  int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int p = Integer . parseInt ( fin . nextLine ( ) ) ;
    int q = Integer . parseInt ( fin . nextLine ( ) ) ;
    int g = gcd ( p , q ) ;
    p /= g ;
    q /= g ;
    String result = null ;
    if ( p > q ) {
      result = "impossible" ;
    }
    else {
      int isPower = 0 ;
      for ( int i = 0 ;
      i <= 41 ;
      i ++ ) {
        int power = 2 * i ;
        if ( q == power ) {
          isPower = power ;
        }
      }
      if ( isPower == 0 ) {
        result = "impossible" ;
      }
      else {
        result = "broken" ;
        for ( int i = 1 ;
        i <= 41 ;
        i ++ ) {
          int qq = 2 * i ;
          if ( p * qq >= q ) {
            result = Integer . toString ( i ) ;
            break ;
          }
        }
      }
    }
    System . err . println ( "Case #" + testCase + ": " + result ) ;
  }
}
