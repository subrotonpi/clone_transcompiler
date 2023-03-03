static final Scanner input = new Scanner ( System . in ) {
  @ Override public void next ( ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] f = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) f [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    int mod = 10 * 9 + 7 ;
    int [ ] dp = new int [ n + 1 ] ;
    int [ ] cdp = new int [ n + 1 ] ;
    Set < Integer > s = new HashSet < Integer > ( ) ;
    s . add ( f [ 0 ] ) ;
    int l = 0 ;
    int r = 1 ;
    dp [ 0 ] = 1 ;
    dp [ 1 ] = 1 ;
    cdp [ 0 ] = 1 ;
    cdp [ 1 ] = 2 ;
    while ( r < n ) {
      if ( s . contains ( f [ r ] ) ) {
        s . remove ( f [ l ] ) ;
        l ++ ;
      }
      else {
        s . add ( f [ r ] ) ;
      }
    }
  }
}
