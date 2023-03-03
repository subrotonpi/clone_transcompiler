public static int max ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  h = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = 0 ;
  int r = 0 ;
  int ans = 0 ;
  if ( n == 1 ) {
    System . out . println ( 1 ) ;
    quit ( ) ;
  }
  while ( r < n - 1 ) {
    while ( h [ r + 1 ] > h [ r ] ) {
      r ++ ;
      if ( r == n - 1 ) {
        ans = Math . max ( ans , r - l + 1 ) ;
        System . out . println ( ans ) ;
        quit ( ) ;
      }
    }
    ans = Math . max ( ans , r - l + 1 ) ;
    l = r ++ ;
  }
  return ans ;
}
