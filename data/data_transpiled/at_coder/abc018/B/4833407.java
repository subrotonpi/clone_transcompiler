public static String S ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int l = Integer . parseInt ( input ( ) ) ;
    int r = Integer . parseInt ( input ( ) ) ;
    S = S . substring ( 0 , l - 1 ) + S . substring ( l - 1 , r ) . substring ( 0 , r ) + S . substring ( r ) ;
  }
  return S ;
}
