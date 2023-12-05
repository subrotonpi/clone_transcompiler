static final int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] h_li = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    h_li [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int s = 0 ;
  int t = 0 ;
  int u = 0 ;
  int ans = 0 ;
  boolean up = true ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( up ) {
      if ( h_li [ i - 1 ] < h_li [ i ] ) {
        t = i ;
        u = i ;
      }
      else {
        u = i ;
        up = false ;
      }
    }
    else {
      if ( h_li [ i - 1 ] > h_li [ i ] ) {
        u = i ;
      }
      else {
        ans = u - s + 1 ;
      }
    }
  }
  ans = Math . max ( ans , u - s + 1 ) ;
  System . out . println ( ans ) ;
  return h_li ;
}
