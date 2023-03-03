public static int [ ] getPods ( int n , int k ) {
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  if ( 0 == s [ n ] ) {
    System . out . println ( n ) ;
  }
  else {
    int left = 0 ;
    int pod = 1 ;
    for ( int i = left ;
    i < n ;
    i ++ ) {
      pod *= s [ i ] ;
      if ( pod <= k ) {
        ans = Math . max ( ans , i - left + 1 ) ;
      }
      else {
        pod /= s [ left ] ;
        left ++ ;
      }
    }
    System . out . println ( ans ) ;
  }
  return s ;
}
