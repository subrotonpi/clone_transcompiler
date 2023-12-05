static int depth ( int k ) {
  final String input = System . getProperty ( "line.separator" ) ;
  System . setIn ( input ) ;
  final int n = Integer . parseInt ( input ) ;
  final int [ ] A = new int [ n - 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) - 1 ;
  }
  final int [ ] [ ] C = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    C [ i ] [ i ] = i + 1 ;
  }
  return depth ( k ) ;
}
