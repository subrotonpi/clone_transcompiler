public static int N ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( N == 4 * i + 7 * j ) {
        count ++ ;
        break ;
      }
    }
  }
  return count > 0 ? 1 : 0 ;
}
