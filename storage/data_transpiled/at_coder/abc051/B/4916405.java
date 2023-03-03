public static int K = Integer . parseInt ( input ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  for ( int x = 0 ;
  x < K + 1 ;
  x ++ ) {
    int yandz = S - x ;
    for ( int y = 0 ;
    y < K + 1 ;
    y ++ ) {
      int z = yandz - y ;
      if ( z >= 0 && z <= K ) {
        count ++ ;
      }
    }
  }
  return count ;
}
