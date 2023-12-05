public static void print ( int n ) {
  int [ ] a1 = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int [ ] a2 = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans = Math . max ( ans , Math . pow ( a1 [ i ] , 2 ) + Math . pow ( a2 [ i ] , 2 ) ) ;
  }
  System . out . println ( ans ) ;
}
