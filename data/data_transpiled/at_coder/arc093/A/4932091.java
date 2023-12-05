public static int [ ] getDistance ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = 0 ;
  }
  Arrays . sort ( A ) ;
  int [ ] D = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    D [ i ] = Math . abs ( A [ i + 1 ] - A [ i ] ) ;
  }
  int S = Arrays . stream ( D ) . sum ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( S - Math . abs ( A [ i ] - A [ i + 1 ] ) - Math . abs ( A [ i + 1 ] - A [ i + 2 ] ) + Math . abs ( A [ i ] - A [ i + 2 ] ) ) ;
  }
  return D ;
}
