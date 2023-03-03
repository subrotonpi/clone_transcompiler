public static void print ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    l [ i ] = p ;
  }
  int max_p = Math . max ( l ) / 2 ;
  int ans = Math . max ( l , max_p ) ;
  System . out . println ( ans ) ;
}
