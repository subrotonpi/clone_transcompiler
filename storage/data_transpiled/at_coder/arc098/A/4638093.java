public static int N = Integer . parseInt ( input ) {
  String S = input ;
  int t = S . indexOf ( "E" ) ;
  int mi = N ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . charAt ( i ) == 'E' ) t -- ;
    mi = Math . min ( mi , t ) ;
    if ( S . charAt ( i ) == 'W' ) t ++ ;
  }
  return mi ;
}
