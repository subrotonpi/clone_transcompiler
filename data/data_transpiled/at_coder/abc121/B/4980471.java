public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int counter = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int s = C ;
    int [ ] A = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      s += A [ j ] * B [ j ] ;
    }
    if ( s > 0 ) {
      counter ++ ;
    }
  }
  System . out . println ( counter ) ;
  return counter ;
}
