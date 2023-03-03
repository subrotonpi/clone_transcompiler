static final int [ ] getAdjacentNodes ( int x ) {
  System . setIn ( new InputStreamReader ( System . in ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int N = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int [ ] L = new int [ N + 1 ] ;
  L [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) L [ i ] = Integer . parseInt ( input ) ;
  int [ ] [ ] adj = new int [ N + 1 ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    adj [ a ] [ i ] = b ;
    adj [ b ] [ i ] = a ;
  }
  return adj ;
}
