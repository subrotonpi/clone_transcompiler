public static int N = Integer . parseInt ( input ) {
  String S = input . next ( ) ;
  int ans = - 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = new HashSet < > ( Collections . singletonList ( S . substring ( 0 , i ) ) ) . size ( ) ;
    if ( x > ans ) {
      ans = x ;
    }
  }
  return ans ;
}
