public static int n ( ) {
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int * A , i ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    A = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = n ;
  for ( int p = 0 ;
  p < 10 ;
  p ++ ) {
    for ( int q = 0 ;
    q < 10 ;
    q ++ ) {
      if ( p == q ) continue ;
      ans = Math . min ( ans , Math . pow ( p , q ) + 1 != A [ i ] ) ;
    }
  }
  System . out . println ( ans * c ) ;
  return ans ;
}
