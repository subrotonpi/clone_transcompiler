public static int K = Integer . parseInt ( input ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  for ( int y = 0 ;
  y < K + 1 ;
  y ++ ) {
    int x = 0 ;
    for ( int x = 0 ;
    x < K + 1 ;
    x ++ ) {
      int z = S - ( x + y ) ;
      if ( z <= K && z >= 0 ) {
        count ++ ;
      }
    }
  }
  return count ;
}
