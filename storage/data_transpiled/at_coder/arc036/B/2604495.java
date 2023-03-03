public static int n ( ) {
  int ans = 0 ;
  int l = 0 ;
  int u = 1 ;
  int c = 0 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    int i = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( u == 0 && i > l ) {
      c = 1 ;
    }
    if ( i > l ) {
      u = 1 ;
    }
    else if ( i < l ) {
      u = 0 ;
    }
    c ++ ;
    ans = Math . max ( ans , c ) ;
    l = i ;
  }
  return ans ;
}
