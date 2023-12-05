public static int k ( ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  for ( int x = 0 ;
  x < k + 1 ;
  x ++ ) {
    for ( int y = 0 ;
    y < k + 1 ;
    y ++ ) {
      int z = s - x - y ;
      if ( z < 0 ) break ;
      if ( z <= k ) count ++ ;
    }
  }
  return count ;
}
