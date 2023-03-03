public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] R = new int [ N ] ;
  for ( int i = 0 ;
  i < R . length ;
  i ++ ) R [ i ] = i ;
  int C = 0 ;
  for ( int i = - K ;
  i <= 0 ;
  i ++ ) C = ( C + R [ i ] ) / 2 ;
  return C ;
}
