public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i ;
    j < N ;
    j ++ ) {
      res ++ ;
    }
  }
  return ( res ) ;
}
