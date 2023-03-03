public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] S = new int [ N ] ;
  S [ 0 ] = 0 ;
  for ( int a : A ) {
    S [ a ] = S [ a ] - 1 ;
  }
  int Min = 10 * 20 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    Min = Math . min ( Min , Math . abs ( ( S [ i ] - S [ 0 ] ) - ( S [ N ] - S [ i ] ) ) ) ;
  }
  System . out . println ( Min ) ;
}
