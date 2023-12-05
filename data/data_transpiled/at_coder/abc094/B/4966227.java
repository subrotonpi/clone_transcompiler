public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int left = 0 ;
  int right = 0 ;
  for ( int i = 1 ;
  i < X ;
  i ++ ) {
    if ( A [ i ] == 0 ) {
      left ++ ;
    }
  }
  for ( int i = X ;
  i < N ;
  i ++ ) {
    if ( A [ i ] == 0 ) {
      right ++ ;
    }
  }
  return left ;
}
