static final Scanner getScanner ( ) {
  final String [ ] vowels = {
    "a" , "e" , "i" , "o" , "u" }
    ;
    final Scanner scanner = new Scanner ( System . in ) ;
    final int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
    final String name = scanner . nextLine ( ) ;
    final int n = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int N = 0 ;
    int P = 0 ;
    int l = - 1 ;
    int s = 0 ;
    for ( int i : xrange ( name . length ( ) ) ) {
      if ( vowels [ i ] . contains ( name . charAt ( i ) ) ) {
        N = N + P ;
        P = P ;
        s = 0 ;
      }
      else {
        if ( s >= n - 1 ) {
          int R = i - n + 1 - l ;
          N = N + P ;
          P = P + R ;
          l = i - n + 1 ;
        }
        else {
          N = N + P ;
          P = P ;
        }
        s ++ ;
      }
    }
    System . out . println ( "Case #" + casenum + ": " + ( N + P ) ) ;
    scanner . close ( ) ;
    final int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
    for ( int k : xrange ( T ) ) {
      doCase ( scanner , k + 1 ) ;
    }
    return scanner ;
  }
  