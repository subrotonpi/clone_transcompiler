public static int [ ] readInput ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] r = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) r [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( r ) ;
  int res = 0 ;
  for ( int i = N - K ;
  i < N ;
  i ++ ) res = ( res + r [ i ] ) / 2 ;
  System . out . println ( res ) ;
  return r ;
}
