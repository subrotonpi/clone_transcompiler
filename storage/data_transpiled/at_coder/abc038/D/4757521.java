static final String print ( String input ) {
  final int N = Integer . parseInt ( input ) ;
  final Pair [ ] L = new Pair [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int w = Integer . parseInt ( input ) ;
    int h = Integer . parseInt ( input ) ;
    L [ i ] = new Pair ( w , - h ) ;
  }
  Arrays . sort ( L ) ;
  final int [ ] LIS = new int [ N ] ;
  LIS [ 0 ] = - L [ 0 ] . 1 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    LIS [ i ] = - L [ i ] . 1 ;
  }
  return LIS [ N ] ;
}
