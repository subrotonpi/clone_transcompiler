static final int [ ] getPolynomial ( int N , int X ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( input ) ;
  final int X = Integer . parseInt ( input ) ;
  final int [ ] b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) b [ i ] = 2 * ( i + 2 ) - 3 ;
  final int [ ] p = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) p [ i ] = 2 * ( i + 1 ) ;
  return p ;
}
