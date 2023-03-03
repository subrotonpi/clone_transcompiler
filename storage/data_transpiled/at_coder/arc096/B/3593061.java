public static int [ ] inpl ( ) {
  return inpl ( ) . split ( " " ) ;
  final int N = inpl ( ) . length ;
  final int C = inpl ( ) . length ;
  final int [ ] x = new int [ N ] , v = inpl ( ) . split ( " " ) ;
  final int cwo = inpl ( ) . length - x . length ;
  final int [ ] cwr = new int [ N ] ;
  cwr [ 0 ] = 0 ;
  cwr [ 1 ] = 0 ;
  cwr [ 2 ] = 0 ;
  cwo = inpl ( ) . length ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) cwr [ i + 1 ] = Math . max ( cwr [ i ] , cwr [ i ] ) ;
  return cwr ;
}
