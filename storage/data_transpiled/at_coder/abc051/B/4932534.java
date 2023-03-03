public static int k = Integer . parseInt ( input ) {
  int s = input . nextInt ( ) ;
  int cnt = 0 ;
  for ( int x = 0 ;
  x <= k ;
  x ++ ) {
    for ( int y = 0 ;
    y <= k ;
    y ++ ) {
      int z = s - x - y ;
      if ( 0 <= z && z <= k ) {
        cnt ++ ;
      }
    }
  }
  return cnt ;
}
