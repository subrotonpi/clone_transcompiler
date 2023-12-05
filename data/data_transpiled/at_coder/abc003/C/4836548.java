public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] R = new int [ N ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    R [ i ] = i ;
  }
  Arrays . sort ( R ) ;
  int rate = 0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    rate += R [ i ] / ( 2 * ( i + 1 ) ) ;
  }
  System . out . println ( rate ) ;
  return rate ;
}
