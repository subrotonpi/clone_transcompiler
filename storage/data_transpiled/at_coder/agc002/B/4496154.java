public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> W = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    W . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int [ ] [ ] BOX = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    BOX [ W . get ( i ) [ 0 ] ] [ 0 ] = 1 ;
    BOX [ W . get ( i ) [ 1 ] ] [ 0 ] = 1 ;
  }
  return BOX [ N ] ;
}
