public static int K = Integer . parseInt ( input ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < K + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < K + 1 ;
    j ++ ) {
      if ( 0 <= S - ( i + j ) && S <= K ) {
        count ++ ;
      }
    }
  }
  return count ;
}
