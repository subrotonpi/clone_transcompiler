public static int N = Integer . parseInt ( input ) {
  String S = input . next ( ) ;
  int x = 0 ;
  int [ ] X = new int [ S . length ( ) ] ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'I' ) x ++ ;
    if ( S . charAt ( i ) == 'D' ) x -- ;
    X [ i ] = x ;
  }
  return x ;
}
