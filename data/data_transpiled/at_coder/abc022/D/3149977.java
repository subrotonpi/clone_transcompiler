static final double [ ] getDifference ( ) {
  final String input = System . getProperty ( "input" ) ;
  final int N = Integer . parseInt ( input ) ;
  final int [ ] Ax = new int [ N ] , Ay = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Ax [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
    Ay [ i ] = Integer . parseInt ( input . substring ( i + 1 , i + 1 ) ) ;
  }
  final int [ ] Bx = new int [ N ] , By = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Bx [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
    By [ i ] = Integer . parseInt ( input . substring ( i + 1 , i + 1 ) ) ;
  }
  return new double [ ] {
  }
  ;
}
