public static int N = Integer . parseInt ( input ) {
  List < Integer > T = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) T . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = Arrays . stream ( T . toArray ( ) ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( s - T . get ( p - 1 ) + x ) ;
  }
  return s ;
}
