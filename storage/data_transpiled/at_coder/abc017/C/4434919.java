static final int [ ] getMatchingMrs ( ) {
  final String in = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( in ) ;
  final int M = Integer . parseInt ( in ) ;
  final List < Integer > LRS = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) LRS . add ( Integer . parseInt ( in ) ) ;
  int maxScore = 0 ;
  final int [ ] imos = new int [ M + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    imos [ i ] = 0 ;
  }
  return imos ;
}
