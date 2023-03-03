static final void solve ( ) throws IOException {
  System . setIn ( new FileInputStream ( "a.in" ) ) ;
  System . setOut ( new FileOutputStream ( "a.out" ) ) ;
  /* getline */
  int [ ] n = new int [ input . available ( ) ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    n [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  /* solve */
  Arrays . sort ( n ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i += 1 ) {
    if ( a [ i ] > a [ i + 1 ] ) {
      ans1 += a [ i ] - a [ i + 1 ] ;
      k = Math . max ( k , a [ i ] - a [ i + 1 ] ) ;
    }
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i += 1 ) {
    ans2 += Math . min ( a [ i ] , k ) ;
  }
  /* solve */
  for ( int T = 0 ;
  T < Integer . parseInt ( input . readLine ( ) ) ;
  T ++ ) {
    System . err . println ( String . valueOf ( T ) ) ;
    System . out . println ( String . format ( "Case #%d: %s" , T + 1 , solve ( ) ) ) ;
  }
}
