public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N + 1 ] ;
  A [ 0 ] = inpl ( ) . add ( 0 ) ;
  int sumtr = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    sumtr += Math . abs ( A [ i + 1 ] - A [ i ] ) ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    System . out . println ( sumtr + Math . abs ( A [ i + 1 ] - A [ i - 1 ] ) - Math . abs ( A [ i ] - A [ i - 1 ] ) - Math . abs ( A [ i + 1 ] - A [ i ] ) ) ;
  }
  return A ;
}
