public static int sum ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] c = new int [ N + 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    c [ i + 1 ] = Math . abs ( a [ i ] - a [ i - 1 ] ) ;
  }
  c [ c . length - 1 ] = Math . abs ( a [ N - 2 ] ) ;
  int s = Arrays . stream ( c ) . sum ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( s - c [ i + 1 ] - c [ i + 2 ] + Math . abs ( a [ i + 1 ] - a [ i - 1 ] ) ) ;
  }
  return s ;
}
