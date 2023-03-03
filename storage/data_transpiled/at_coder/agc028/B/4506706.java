static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) {
    System . out . println ( "Scanner is closed" ) ;
    int mod = 10 * 9 + 7 ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] A = Lists . newArrayList ( ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    int [ ] S = Lists . newArrayList ( ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      S [ i ] = Math . pow ( i , mod - 2 ) ;
    }
    int ans = 0 ;
    int num = 1 ;
    for ( int i = 2 ;
    i <= n ;
    i ++ ) {
      ans += A [ i ] * ( S [ i ] + S [ n - 1 - i ] - 1 ) % mod ;
    }
    ans = ans * num % mod ;
    System . out . println ( ans ) ;
  }
}
