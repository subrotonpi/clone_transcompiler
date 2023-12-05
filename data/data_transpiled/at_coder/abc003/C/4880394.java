public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] R = new int [ N ] ;
  for ( int i = 0 ;
  i < R . length ;
  i ++ ) R [ i ] = i ;
  Arrays . sort ( R , 0 , K ) ;
  int rate = 0 ;
  for ( int r : R ) rate = ( rate + r ) / 2 ;
  return rate ;
}
