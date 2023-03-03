public static String [ ] [ ] getStrings ( int N , int Q ) {
  int [ ] * p = new int [ N + N ] , y ;
  int w ;
  int x , y ;
  /* root */
  if ( x == p [ x ] ) {
    return x ;
  }
  y = p [ x ] = root ( p [ x ] ) ;
  /* unite */
  x = root ( x ) ;
  y = root ( y ) ;
  if ( px < py ) {
    p [ py ] = px ;
  }
  else {
    p [ px ] = py ;
  }
  String [ ] [ ] ans = new String [ Q ] [ ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    w = Integer . parseInt ( input ( ) ) ;
    x = y -- ;
    y = z -- ;
    if ( w == 1 ) {
      if ( z % 2 != 0 ) {
        unite ( x , y + N ) ;
        unite ( x + N , y ) ;
      }
    }
    else {
      ans [ i ] = "YES" ;
    }
  }
  return ans ;
}
