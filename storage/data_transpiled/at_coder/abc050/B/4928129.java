public static int n = Integer . parseInt ( input ) {
  int [ ] t = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Arrays . stream ( t ) . reduce ( 0 , t [ 0 ] ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( T - ( t [ p - 1 ] - x ) ) ;
  }
  return T ;
}
