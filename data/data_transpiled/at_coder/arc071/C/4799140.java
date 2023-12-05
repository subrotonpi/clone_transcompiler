public static void input ( ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> info = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    info . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int MOD = 3 ;
  HashMap < String , Integer > memo = new HashMap < > ( ) ;
  memo . put ( "A" , 1 ) ;
  memo . put ( "B" , 2 ) ;
  int [ ] sRuiseki = new int [ s . length ( ) + 1 ] ;
  for ( int i = 1 ;
  i <= s . length ( ) ;
  i ++ ) {
    sRuiseki [ i ] = ( sRuiseki [ i - 1 ] + memo . get ( s . charAt ( i - 1 ) ) ) % MOD ;
  }
  int [ ] tRuiseki = new int [ t . length ( ) + 1 ] ;
  for ( int i = 1 ;
  i <= t . length ( ) ;
  i ++ ) {
    tRuiseki [ i ] = ( tRuiseki [ i - 1 ] + memo . get ( t . charAt ( i - 1 ) ) ) % MOD ;
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int ans1 = ( 2 * sRuiseki [ info . get ( i ) . x - 1 ] + sRuiseki [ info . get ( i ) . y ] ) % MOD ;
    int ans2 = ( 2 * tRuiseki [ info . get ( i ) . z - 1 ] + tRuiseki [ info . get ( i ) . z ] ) % MOD ;
    System . out . println ( ans1 == ans2 ? "YES" : "NO" ) ;
  }
}
