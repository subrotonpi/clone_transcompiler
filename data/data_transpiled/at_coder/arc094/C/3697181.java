public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] , B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = inpl ( ) ;
    int b = inpl ( ) ;
    A [ i ] = b ;
    B [ i ] = a ;
  }
}
