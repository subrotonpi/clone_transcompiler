, n = Integer . MAX_VALUE ) public static void input ( ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] b = a . clone ( ) ;
  int d = Integer . MAX_VALUE ;
  for ( int j = 1 ;
  j < n ;
  j ++ ) {
    b = Arrays . copyOf ( b , n ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      b [ i ] = Math . min ( b [ i ] , a [ i - j ] ) ;
    }
    d = Math . min ( d , Math . pow ( b , j ) + j * x ) ;
  }
  System . out . println ( d ) ;
}
