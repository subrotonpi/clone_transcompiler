public static int N = Integer . parseInt ( input ) {
  int [ ] minTime = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    minTime [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int speed = Integer . parseInt ( input . nextLine ( ) ) ;
    int start = Integer . parseInt ( input . nextLine ( ) ) ;
    int interval = Integer . parseInt ( input . nextLine ( ) ) ;
    minTime [ i ] += start + speed ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( minTime [ j ] - start < 0 ) {
        minTime [ j ] = start ;
      }
      else {
        while ( ( minTime [ j ] - start ) % interval != 0 ) {
          minTime [ j ] ++ ;
        }
      }
      minTime [ j ] += speed ;
    }
  }
  for ( int ans : minTime ) {
    System . out . println ( ans ) ;
  }
  return N ;
}
