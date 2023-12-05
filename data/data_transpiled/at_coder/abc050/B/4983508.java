public static int N = Integer . parseInt ( input ) {
  int [ ] T = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = 0 ;
  for ( int i = 0 ;
  i < T . length ;
  i ++ ) s += T [ i ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int P = Integer . parseInt ( input . nextLine ( ) ) ;
    int X = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( s - T [ P - 1 ] + X ) ;
  }
  return s ;
}
