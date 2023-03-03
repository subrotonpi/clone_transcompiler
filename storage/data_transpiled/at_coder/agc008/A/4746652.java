public static int x = Integer . parseInt ( input ) {
  int x = 0 , y = 0 ;
  int ans = 0 ;
  do {
    if ( x == y ) {
      System . out . println ( ans ) ;
      break ;
    }
    if ( x == - y ) {
      x = - x ;
      ans ++ ;
      continue ;
    }
    if ( ( Math . abs ( x ) < Math . abs ( y ) && x < 0 ) || ( Math . abs ( y ) < Math . abs ( x ) && 0 <= x ) ) {
      x = - x ;
      ans ++ ;
      continue ;
    }
    ans += Math . abs ( Math . abs ( x ) - Math . abs ( y ) ) ;
    x += Math . abs ( Math . abs ( x ) - Math . abs ( y ) ) ;
  }
  while ( x < y ) ;
  return ans ;
}
