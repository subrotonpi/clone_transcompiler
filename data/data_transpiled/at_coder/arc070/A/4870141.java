public static int X = Integer . parseInt ( input ) {
  int l = 0 ;
  for ( int i = 0 ;
  i < X ;
  i ++ ) {
    l += ( i + 1 ) ;
    if ( l >= X ) {
      ans = i + 1 ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
