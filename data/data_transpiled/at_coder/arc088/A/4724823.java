public static int x ( int y ) {
  int ans = 1 ;
  int a = x ;
  for ( ;
  ;
  ) {
    a *= 2 ;
    if ( a <= y ) {
      ans ++ ;
    }
    else {
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
