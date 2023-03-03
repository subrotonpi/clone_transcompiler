public static int n ( ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < 40 ;
  i ++ ) {
    if ( i * i <= n && ans <= i * i ) {
      ans = i * i ;
    }
    if ( i * i <= n && ans <= i * i ) {
      ans = i * i ;
    }
    if ( i * i <= n && ans <= i * i ) {
      ans = i * i ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
