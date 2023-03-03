static final Scanner input = new Scanner ( System . in ) {
  @ Override public int next ( ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int k = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] A = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    if ( k % gcd_list ( A ) == 0 && k <= max ( A ) ) {
      System . out . println ( "POSSIBLE" ) ;
    }
    else {
      System . out . println ( "IMPOSSIBLE" ) ;
    }
    return 0 ;
  }
}
