public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] R = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  Arrays . sort ( R ) ;
  int Rate = 0 ;
  for ( int i : R [ N - K : N + 1 ] ) {
    Rate = ( Rate + i ) / 2 ;
  }
  System . out . println ( Rate ) ;
  return Rate ;
}
