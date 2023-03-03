public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] h = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( h ) ;
  int c [ ] = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    c [ i ] = h [ i + K - 1 ] - h [ i ] ;
  }
  System . out . println ( min ( c ) ) ;
  return c [ 0 ] ;
}
