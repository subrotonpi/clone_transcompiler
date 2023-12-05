public static int n ( ) {
  int i = 0 ;
  while ( 2 * i <= n ) {
    i ++ ;
  }
  if ( i % 2 == 0 ) {
    /* t */
    return 2 * i ;
    /* a */
  }
  else {
    /* a */
    return 2 * i + 1 ;
  }
  int x = 1 ;
  int j = 0 ;
  while ( x <= n ) {
    if ( j % 2 == 0 ) {
      x = t ( x ) ;
    }
    else {
      x = a ( x ) ;
    }
    j ++ ;
  }
  if ( j % 2 == 0 ) {
    System . out . println ( "Takahashi" ) ;
  }
  else {
    System . out . println ( "Aoki" ) ;
  }
  return x ;
}
