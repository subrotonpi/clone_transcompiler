public static void print ( int n ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    Set < Integer > x = s . subList ( 0 , i ) ;
    Set < Integer > y = s . subList ( i , i ) ;
    ans = Math . max ( ans , x . size ( ) & y . size ( ) ) ;
  }
  System . out . println ( ans ) ;
}
