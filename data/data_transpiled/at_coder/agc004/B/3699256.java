, n = Integer . MAX_VALUE ) public static void input ( ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] b = a . clone ( ) ;
  int ans = Integer . MAX_VALUE ;
  for ( int k = 1 ;
  k < n ;
  k ++ ) {
    b = Arrays . copyOf ( b , n ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) b [ i ] = Math . min ( b [ i ] , a [ i - k ] ) ;
    ans = Math . min ( ans , Math . pow ( b , k ) + k * x ) ;
  }
  System . out . println ( ans ) ;
}
